package com.lps.service.impl;

import com.lps.mapper.CustomerMapper;
import com.lps.mapper.GoodMapper;
import com.lps.mapper.OrderMapper;
import com.lps.po.CustomerExample;
import com.lps.po.GoodExample;
import com.lps.po.OrderExample;
import com.lps.service.MessageShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: MessageShowServiceImpl
 * @Description:
 * @Author: 梁培珊
 * @Date: 10:54 2019/4/13
 **/
@Service
public class MessageShowServiceImpl implements MessageShowService {

    @Autowired
    private GoodMapper goodMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Map<String, Integer> welcomeMsg() {
        Map<String,Integer> map = new HashMap<>();
        GoodExample goodExample = new GoodExample();
        CustomerExample customerExample = new CustomerExample();
        OrderExample orderExample = new OrderExample();
        GoodExample.Criteria criteriaGood = goodExample.createCriteria();
        criteriaGood.andGoodStateEqualTo(true);
        int goodNum = goodMapper.countByExample(goodExample);
        int customerNum=customerMapper.countByExample(customerExample);
        OrderExample.Criteria criteriaOrder = orderExample.createCriteria();
        criteriaOrder.andOrderStateEqualTo(3);
        OrderExample orderExample1 = new OrderExample();
        OrderExample.Criteria criteriaOrder1 = orderExample1.createCriteria();
        criteriaOrder1.andOrderStateEqualTo(1);
        int orderFinishNum = orderMapper.countByExample(orderExample);
        int orderUnFiniNum = orderMapper.countByExample(orderExample1);
        map.put("goodNum",goodNum);
        map.put("customerNum",customerNum);
        map.put("orderFinishNum",orderFinishNum);
        map.put("orderUnFiniNum",orderUnFiniNum);
        return map;
    }
}
