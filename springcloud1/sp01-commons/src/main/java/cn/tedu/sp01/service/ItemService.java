package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.Item;

import java.util.List;

public interface ItemService {
    //根据订单id获取商品列表
    List<Item> getItem(String orderId);
    //减少库存
    void decreaseNumber(List<Item> items);
}