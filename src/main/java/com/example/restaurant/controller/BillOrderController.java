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

import com.example.restaurant.entity.BillOrder;

import com.example.restaurant.service.BillOrderService;


@RestController
@RequestMapping("/api/billOrders")
public class BillOrderController {
    @Autowired
    private BillOrderService billOrderService;

    @GetMapping
    public List<BillOrder> getAllBillOrders() {
        return billOrderService.getAllBillOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BillOrder> getBillOrdersById(@PathVariable Long id) {
        BillOrder billOrder = billOrderService.getBillOrdersById(id);
        if (billOrder != null) {
            return ResponseEntity.ok(billOrder);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<String> addBillOrders(@RequestBody BillOrder billOrder) {
        boolean isAdded = billOrderService.addBillOrders(billOrder);
        if (isAdded) {
            return ResponseEntity.status(HttpStatus.CREATED).body("BillOrder created successfully.");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to create BillOrder.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateBillOrders(@PathVariable Long id, @RequestBody BillOrder billOrder) {
        billOrder.setId(id);
        boolean isUpdated = billOrderService.updateBillOrders(billOrder);
        if (isUpdated) {
            return ResponseEntity.ok("BillOrder updated successfully.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("BillOrder not found.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBillOrders(@PathVariable Long id) {
        boolean isDeleted = billOrderService.deleteBillOrders(id);
        if (isDeleted) {
            return ResponseEntity.ok("BillOrder deleted successfully.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("BillOrder not found.");
    }
}
