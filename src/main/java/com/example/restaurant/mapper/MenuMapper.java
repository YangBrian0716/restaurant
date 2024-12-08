package com.example.restaurant.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.restaurant.entity.Menu;
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> getAllMenus(); // 獲取所有菜單，返回菜單列表
    Menu getMenuById(Long id); // 根據ID查詢菜單，返回單個菜單對象
    int insertMenu(Menu menu); // 插入菜單，返回受影響的行數（成功為1）
    int updateMenu(Menu menu); // 更新菜單，返回受影響的行數（成功為1）
    int deleteMenu(Long id);   // 刪除菜單，返回受影響的行數（成功為1）

	
}