package com.lucky.shop.admin.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lucky.shop.admin.mall.domain.ShopOrder;

import java.util.Map;

/**
 * @Author Guo Huaijian
 * @Date 2020/6/5 12:55
 */
public interface ShopOrderService extends IService<ShopOrder> {

    /**
     * 获取订单统计信息
     *
     * @return
     */
    Map getOrderStatistic();

    /**
     * 更新订单信息
     * @param order
     */
    void send(ShopOrder order);

}
