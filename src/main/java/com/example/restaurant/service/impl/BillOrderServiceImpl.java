package com.example.restaurant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restaurant.entity.BillOrder;
import com.example.restaurant.mapper.BillOrderMapper;
import com.example.restaurant.service.BillOrderService;
@Service
public class BillOrderServiceImpl implements BillOrderService{
    @Autowired
    private BillOrderMapper billOrderMapper;

    @Override
    public List<BillOrder> getAllBillOrders() {
        return billOrderMapper.getAllBillOrders();
    }

    @Override
    public BillOrder getBillOrdersById(Long id) {
        return billOrderMapper.getBillOrdersById(id);
    }

    @Override
    public boolean addBillOrders(BillOrder billOrder) {
        return billOrderMapper.insertBillOrders(billOrder)>0;
    }

    @Override
    public boolean updateBillOrders(BillOrder billOrder) {
        return billOrderMapper.updateBillOrders(billOrder)>0;
    }

    @Override
    public boolean deleteBillOrders(Long id) {
       return billOrderMapper.deleteBillOrders(id)>0;
    }

}
