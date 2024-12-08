package com.example.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.entity.Menu;
import com.example.restaurant.service.MenuService;

@RestController
@RequestMapping("/api/menus")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Menu> getMenuById(@PathVariable Long id) {
        Menu menu = menuService.getMenuById(id);
        if (menu != null) {
            return ResponseEntity.ok(menu);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<String> addMenu(@RequestBody Menu menu) {
        boolean isAdded = menuService.addMenu(menu);
        if (isAdded) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Menu created successfully.");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to create menu.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateMenu(@PathVariable Long id, @RequestBody Menu menu) {
        menu.setId(id);
        boolean isUpdated = menuService.updateMenu(menu);
        if (isUpdated) {
            return ResponseEntity.ok("Menu updated successfully.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Menu not found.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMenu(@PathVariable Long id) {
        boolean isDeleted = menuService.deleteMenu(id);
        if (isDeleted) {
            return ResponseEntity.ok("Menu deleted successfully.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Menu not found.");
    }
}
