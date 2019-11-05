package cn.ztuo.bitrade.controller.finance;

import com.alibaba.fastjson.JSONObject;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import cn.ztuo.bitrade.annotation.AccessLog;
import cn.ztuo.bitrade.constant.AdminModule;
import cn.ztuo.bitrade.constant.PageModel;
import cn.ztuo.bitrade.constant.TransactionType;
import cn.ztuo.bitrade.entity.MemberTransaction;
import cn.ztuo.bitrade.es.ESUtils;
import cn.ztuo.bitrade.service.LocaleMessageSourceService;
import cn.ztuo.bitrade.service.MemberTransactionService;
import cn.ztuo.bitrade.util.DateUtil;
import cn.ztuo.bitrade.util.FileUtil;
import cn.ztuo.bitrade.util.MessageResult;
import cn.ztuo.bitrade.vo.MemberTransactionVO;

import cn.ztuo.bitrade.controller.common.BaseAdminController;
import cn.ztuo.bitrade.entity.QMember;
import cn.ztuo.bitrade.entity.QMemberTransaction;
import cn.ztuo.bitrade.model.screen.MemberTransactionScreen;
import cn.ztuo.bitrade.model.vo.MemberTransaction2ESVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.util.Assert.notNull;

/**
 * @author GS
 * @description 交易记录
 * @date 2018/1/17 17:07
 */
@RestController
@Slf4j
@RequestMapping("/finance/member-transaction")
public class MemberTransactionController extends BaseAdminController {

    @Autowired
    private EntityManager entityManager;

    //查询工厂实体
    private JPAQueryFactory queryFactory;
    @Autowired
    private LocaleMessageSourceService messageSource;

    @Autowired
    private MemberTransactionService memberTransactionService;
    @Autowired
    private ESUtils esUtils;

    @RequiresPermissions("finance:member-transaction:all")
    @PostMapping("/all")
    @AccessLog(module = AdminModule.FINANCE, operation = "所有交易记录MemberTransaction")
    public MessageResult all() {
        List<MemberTransaction> memberTransactionList = memberTransactionService.findAll();
        if (memberTransactionList != null && memberTransactionList.size() > 0) {
            return success(memberTransactionList);
        }
        return error(messageSource.getMessage("NO_DATA"));
    }

    /**
     * 交易详情
     */
    @RequiresPermissions("finance:member-transaction:detail")
    @PostMapping("detail")
    @AccessLog(module = AdminModule.FINANCE, operation = "交易记录MemberTransaction 详情")
    public MessageResult detail(@RequestParam(value = "id") Long id) {
        MemberTransaction memberTransaction = memberTransactionService.findOne(id);
        notNull(memberTransaction, "validate id!");
        return success(memberTransaction);
    }

    /**
     * 交易记录列表
     */
    @RequiresPermissions(value = {"finance:member-transaction:page-query", "finance:member-transaction:page-query:recharge",
            "finance:member-transaction:page-query:check", "finance:member-transaction:page-query:fee"}, logical = Logical.OR)
    @PostMapping("page-query")
    @AccessLog(module = AdminModule.FINANCE, operation = "分页查找交易记录MemberTransaction")
    public MessageResult pageQuery(
            PageModel pageModel,
            MemberTransactionScreen screen) {
        List<Predicate> predicates = new ArrayList<>();

        if(screen.getMemberId()!=null) {
            predicates.add((QMember.member.id.eq(screen.getMemberId())));
        }
        if (!StringUtils.isEmpty(screen.getAccount())) {
            predicates.add(QMember.member.username.like("%"+screen.getAccount()+"%")
                        .or(QMember.member.realName.like("%"+screen.getAccount()+"%")));
        }
        if (screen.getStartTime() != null) {
            predicates.add(QMemberTransaction.memberTransaction.createTime.goe(screen.getStartTime()));
        }
        if (screen.getEndTime() != null){
            predicates.add(QMemberTransaction.memberTransaction.createTime.lt(DateUtil.dateAddDay(screen.getEndTime(),1)));
        }
        if (screen.getType() != null) {
            predicates.add(QMemberTransaction.memberTransaction.type.eq(screen.getType()));
        }

        if(screen.getMinMoney()!=null) {
            predicates.add(QMemberTransaction.memberTransaction.amount.goe(screen.getMinMoney()));
        }

        if(screen.getMaxMoney()!=null) {
            predicates.add(QMemberTransaction.memberTransaction.amount.loe(screen.getMaxMoney()));
        }

        if(screen.getMinFee()!=null) {
            predicates.add(QMemberTransaction.memberTransaction.fee.goe(screen.getMinFee()));
        }

        if(screen.getMaxFee()!=null) {
            predicates.add(QMemberTransaction.memberTransaction.fee.loe(screen.getMaxFee()));
        }

        Page<MemberTransactionVO> results = memberTransactionService.joinFind(predicates, pageModel);

        return success(results);
    }

    @RequiresPermissions("finance:member-transaction:out-excel")
    @GetMapping("out-excel")
    @AccessLog(module = AdminModule.FINANCE, operation = "导出交易记录MemberTransaction Excel")
    public MessageResult outExcel(
            @RequestParam(value = "startTime", required = false) Date startTime,
            @RequestParam(value = "endTime", required = false) Date endTime,
            @RequestParam(value = "type", required = false) TransactionType type,
            @RequestParam(value = "memberId", required = false) Long memberId,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<BooleanExpression> booleanExpressionList = getBooleanExpressionList(startTime, endTime, type, memberId);
        List list = memberTransactionService.queryWhereOrPage(booleanExpressionList, null, null).getContent();
        return new FileUtil().exportExcel(request, response, list, "交易记录");
    }

    // 获得条件
    private List<BooleanExpression> getBooleanExpressionList(
            Date startTime, Date endTime, TransactionType type, Long memberId) {
        QMemberTransaction qEntity = QMemberTransaction.memberTransaction;
        List<BooleanExpression> booleanExpressionList = new ArrayList();
        if (startTime != null) {
            booleanExpressionList.add(qEntity.createTime.gt(startTime));
        }
        if (endTime != null) {
            booleanExpressionList.add(qEntity.createTime.lt(endTime));
        }
        if (type != null) {
            booleanExpressionList.add(qEntity.type.eq(type));
        }
        if (memberId != null) {
            booleanExpressionList.add(qEntity.memberId.eq(memberId));
        }
        return booleanExpressionList;
    }

    @RequiresPermissions(value = {"finance:member-transaction:page-query", "finance:member-transaction:page-query:recharge",
            "finance:member-transaction:page-query:check", "finance:member-transaction:page-query:fee"}, logical = Logical.OR)
    @PostMapping("page-query_es")
    @AccessLog(module = AdminModule.FINANCE, operation = "分页查找交易记录MemberTransaction")
    public MessageResult getPageQueryByES( MemberTransaction2ESVO transactionVO) {
        log.info(">>>>>>查询交易明细开始>>>>>>>>>");
        try {
            String query="{\"from\":"+(transactionVO.getPageNo()-1)*transactionVO.getPageSize()+",\"size\":"+ transactionVO.getPageSize()+",\"sort\":[{\"create_time\":{\"order\":\"desc\"}}]," +
                    "\"query\":{\"bool\":{\"must\":[";
            boolean deleteFlag =false;
            if(!StringUtils.isEmpty(transactionVO.getStartTime())&&!StringUtils.isEmpty(transactionVO.getEndTime())){
                query+="{\"range\":{\"create_time\":{\"gte\":\""+transactionVO.getStartTime()+"\",\"lte\":\""+transactionVO.getEndTime()+"\"}}},";
                deleteFlag =true;
            }
            if(!StringUtils.isEmpty(transactionVO.getType())){
                query+="{\"match\":{\"type\":\""+transactionVO.getType()+"\"}},";
                deleteFlag =true;
            }
            if(!StringUtils.isEmpty(transactionVO.getMemberId())){
                query+="{\"match\":{\"member_id\":\""+transactionVO.getMemberId()+"\"}},";
                deleteFlag =true;
            }
            if(!StringUtils.isEmpty(transactionVO.getMinMoney())){
                query+="{\"range\":{\"amount\":{\"gte\":\""+transactionVO.getMinMoney()+"\"}}},";
                deleteFlag =true;
            }
            if(!StringUtils.isEmpty(transactionVO.getMaxMoney())){
                query+="{\"range\":{\"amount\":{\"lte\":\""+transactionVO.getMaxMoney()+"\"}}},";
                deleteFlag =true;
            }
            if(!StringUtils.isEmpty(transactionVO.getMinFee())){
                query+="{\"range\":{\"fee\":{\"gte\":\""+transactionVO.getMinFee()+"\"}}},";
            }
            if(!StringUtils.isEmpty(transactionVO.getMaxFee())){
                query+="{\"range\":{\"fee\":{\"lte\":\""+transactionVO.getMaxFee()+"\"}}},";
                deleteFlag =true;
            }
            if(deleteFlag){
                //去除最后一个符号
                query.substring(0,query.length()-1);
            }
            query+="]}}}";
            return success(esUtils.queryForAnyOne(JSONObject.parseObject(query),"member_transaction","mem_transaction"));
        }catch (Exception e){
            log.info(">>>>>>查询异常>>>"+e);
            return error("查询异常");
        }
    }
}
