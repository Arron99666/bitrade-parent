package cn.ztuo.bitrade.service;

import cn.ztuo.bitrade.dao.ExchangeOrderDetailRepository;
import cn.ztuo.bitrade.dao.ExchangeOrderRepository;
import cn.ztuo.bitrade.dao.OrderDetailAggregationRepository;
import cn.ztuo.bitrade.entity.ExchangeOrderDetail;
import cn.ztuo.bitrade.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ExchangeOrderDetailService {
    @Autowired
    private ExchangeOrderDetailRepository orderDetailRepository;

    @Autowired
    private ExchangeOrderRepository exchangeOrderRepository ;

    @Autowired
    private MemberService memberService ;

    @Autowired
    private OrderDetailAggregationRepository orderDetailAggregationRepository;


    /**
     * 查询某订单的成交详情
     * @param orderId
     * @return
     */
    public List<ExchangeOrderDetail> findAllByOrderId(String orderId){
        return orderDetailRepository.findAllByOrderId(orderId);
    }

    public ExchangeOrderDetail save(ExchangeOrderDetail detail){
       return orderDetailRepository.save(detail);
    }
}
