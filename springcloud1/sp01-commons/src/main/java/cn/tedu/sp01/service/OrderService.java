package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.Order;

public interface OrderService {
    //获取订单信息
    Order getOrder(String orderId);
    //保存订单信息
    void addOrder(Order order);
}