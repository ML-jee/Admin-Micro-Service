package org.example.adminmicroservice.controller;

import org.example.adminmicroservice.dto.AddAssuranceDto;
import org.example.adminmicroservice.dto.UpdateAssuranceDto;
import org.example.adminmicroservice.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;




    @GetMapping("/all")
    public List<AddAssuranceDto> getAllAssurances() {
        return adminService.getAllAssurances();
    }

    @GetMapping("/{id}")
    public AddAssuranceDto getAssuranceById(@PathVariable int id) {
        return adminService.getAssuranceById(id);
    }

    @PostMapping("/add")
    public AddAssuranceDto saveAssurance(@RequestBody AddAssuranceDto assuranceDto) {
        return adminService.saveAssurance(assuranceDto);
    }

    @PutMapping("/update/{id}")
    public UpdateAssuranceDto updateAssurance(@PathVariable int id, @RequestBody UpdateAssuranceDto updateAssuranceDto) {
        return adminService.updateAssurance(id, updateAssuranceDto);
    }

}