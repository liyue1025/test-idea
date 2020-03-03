package com.liyue.propject.controller;

import com.liyue.propject.bean.Admin;
import com.liyue.propject.mapper.AdminMapper;
import com.liyue.propject.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/admin")
    public List<Admin> findAll(){
        return adminService.findAll();
    }

}
