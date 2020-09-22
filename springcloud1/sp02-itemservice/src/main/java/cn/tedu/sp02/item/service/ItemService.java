package cn.tedu.sp02.item.service;

import cn.tedu.sp01.pojo.Item;

import java.util.List;

public interface ItemService {
    List<Item> getItems(String orderId);
    void decreaseNumbers(List<Item> list);
}
