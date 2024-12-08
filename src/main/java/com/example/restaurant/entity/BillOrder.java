package com.example.restaurant.entity;

import java.math.BigDecimal;

import java.util.Date;



import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("bill_order")
public class BillOrder {
    private Long id;
    private Date orderTime;
    private BigDecimal totalPrice;


}
