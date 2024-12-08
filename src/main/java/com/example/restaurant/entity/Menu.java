package com.example.restaurant.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableName;


import lombok.Data;

@Data
@TableName("menu")
public class Menu {
    private Long id;
    private String name;
    private String description;
    private String image;
    private BigDecimal price;
    private String type;
    private String ingredients;
   
}