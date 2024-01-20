package org.example.adminmicroservice.service;

import org.example.adminmicroservice.dto.AssuranceAdminDto;

import java.util.List;

public interface AdminService {
    List<AssuranceAdminDto> getAllAssurances();
    AssuranceAdminDto getAssuranceById(int id);
    AssuranceAdminDto saveAssurance(AssuranceAdminDto assuranceAdminDto);

}
