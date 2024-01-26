package org.example.adminmicroservice.service;

import org.example.adminmicroservice.dto.AddAssuranceDto;
import org.example.adminmicroservice.dto.UpdateAssuranceDto;

import java.util.List;

public interface AdminService {
    List<AddAssuranceDto> getAllAssurances();
    AddAssuranceDto getAssuranceById(String id);
    AddAssuranceDto saveAssurance(AddAssuranceDto addAssuranceDto);
    UpdateAssuranceDto updateAssurance(String id, UpdateAssuranceDto updateAssuranceDto);



}
