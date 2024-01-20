package org.example.adminmicroservice.controller;

import org.example.adminmicroservice.dto.AssuranceAdminDto;
import org.example.adminmicroservice.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public List<AssuranceAdminDto> getAllAssurances() {
        return adminService.getAllAssurances();
    }

    @GetMapping("/{id}")
    public AssuranceAdminDto getAssuranceById(@PathVariable int id) {
        return adminService.getAssuranceById(id);
    }

    @PostMapping("/add")
    public AssuranceAdminDto saveAssurance(@RequestBody AssuranceAdminDto assuranceDto) {
        return adminService.saveAssurance(assuranceDto);
    }

    @PutMapping("/update/{id}")
    public AssuranceAdminDto updateAssurance(@PathVariable int id, @RequestBody AssuranceAdminDto assuranceDto) {
        return adminService.saveAssurance(assuranceDto);
    }

}
