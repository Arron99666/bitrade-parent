package cn.ztuo.bitrade.controller.activity;

import cn.ztuo.bitrade.constant.PageModel;
import cn.ztuo.bitrade.entity.MemberSignRecord;
import cn.ztuo.bitrade.service.MemberSignRecordService;
import cn.ztuo.bitrade.util.MessageResult;

import cn.ztuo.bitrade.controller.common.BaseAdminController;
import cn.ztuo.bitrade.model.screen.MemberSignRecordScreen;
import cn.ztuo.bitrade.model.vo.MemberSignRecordVO;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GS
 * @Description: 会员签到记录
 * @date 2018/5/410:27
 */
@RestController
@RequestMapping("activity/member-sign-record")
public class MemberSignRecordControler extends BaseAdminController {
    @Autowired
    private MemberSignRecordService service;

    @RequiresPermissions("activity:member-sign-record:page-query")
    @GetMapping("page-query")
    public MessageResult pageQuery(MemberSignRecordScreen screen, PageModel pageModel) {
        Page<MemberSignRecord> source = service.findAllScreen(screen, pageModel);
        Page<MemberSignRecordVO> page = source.map(x -> MemberSignRecordVO.getMemberSignRecordVO(x));
        return success(page);
    }
}
