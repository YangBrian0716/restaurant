package com.example.restaurant.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.restaurant.entity.BillOrder;

@Mapper
public interface BillOrderMapper extends BaseMapper<BillOrderMapper> {

    List<BillOrder> getAllBillOrders(); // 獲取所有菜單，返回菜單列表
    BillOrder getBillOrdersById(Long id); // 根據ID查詢菜單，返回單個菜單對象
    int insertBillOrders(BillOrder billOrder); // 插入菜單，返回受影響的行數（成功為1）
    int updateBillOrders(BillOrder billOrder); // 更新菜單，返回受影響的行數（成功為1）
    int deleteBillOrders(Long id);   // 刪除菜單，返回受影響的行數（成功為1）

	
}