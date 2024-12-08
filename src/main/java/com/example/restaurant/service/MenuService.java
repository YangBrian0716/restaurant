package com.example.restaurant.service;

import java.util.List;

import com.example.restaurant.entity.Menu;

public interface MenuService {
    List<Menu> getAllMenus(); // 獲取所有菜單
    Menu getMenuById(Long id); // 根據 ID 獲取菜單
    boolean addMenu(Menu menu); // 添加菜單
    boolean updateMenu(Menu menu);
    boolean deleteMenu(Long id); // 刪除菜單
    

}
