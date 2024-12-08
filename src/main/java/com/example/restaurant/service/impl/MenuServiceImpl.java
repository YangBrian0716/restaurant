package com.example.restaurant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restaurant.entity.Menu;
import com.example.restaurant.mapper.MenuMapper;
import com.example.restaurant.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    private MenuMapper menuMapper;

    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

    public Menu getMenuById(Long id) {
        return menuMapper.getMenuById(id);
    }

    public boolean addMenu(Menu menu) {
        return menuMapper.insertMenu(menu) > 0;
    }

    public boolean updateMenu(Menu menu) {
        return menuMapper.updateMenu(menu) > 0;
    }

    public boolean deleteMenu(Long id) {
        return menuMapper.deleteMenu(id) > 0;
    }

   
}


