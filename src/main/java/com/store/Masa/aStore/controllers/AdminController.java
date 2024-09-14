package com.store.Masa.aStore.controllers;

import com.store.Masa.aStore.entity.Admin;
import com.store.Masa.aStore.repositories.AdminRepository;
import com.store.Masa.aStore.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admins")
@AllArgsConstructor
public class AdminController {
    AdminRepository adminRepository;

    @GetMapping
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll(); // haik zabat bs mish lazm el controller to call the repo direct
        // you should create a service, controller should call the service, service handle all logic and
        // call the repository for database... ns shouldnt call he repo here
    }
}
