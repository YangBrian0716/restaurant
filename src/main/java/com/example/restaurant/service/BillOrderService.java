package com.example.restaurant.service;

import java.util.List;

import com.example.restaurant.entity.BillOrder;

public interface BillOrderService {
    List<BillOrder> getAllBillOrders(); // 獲取所有菜單
    BillOrder getBillOrdersById(Long id); // 根據 ID 獲取菜單
    boolean addBillOrders(BillOrder billOrder); // 添加菜單
    boolean updateBillOrders(BillOrder billOrder);
    boolean deleteBillOrders(Long id); // 刪除菜單
    

}