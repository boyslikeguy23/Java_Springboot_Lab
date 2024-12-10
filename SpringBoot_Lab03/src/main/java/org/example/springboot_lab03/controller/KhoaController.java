package org.example.springboot_lab03.controller;

import org.example.springboot_lab03.entity.Khoa;
import org.example.springboot_lab03.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KhoaController {
    private KhoaService khoaService;

    @GetMapping("/khoas")
    public List<Khoa> getAllKhoas(){
        return  khoaService.getKhoaList();
    }
}