package org.example.adminmicroservice.service;

import org.example.adminmicroservice.dto.AddAssuranceDto;
import org.example.adminmicroservice.dto.UpdateAssuranceDto;

import java.util.List;

public interface AdminService {
    List<AddAssuranceDto> getAllAssurances();
    AddAssuranceDto getAssuranceById(int id);
    AddAssuranceDto saveAssurance(AddAssuranceDto addAssuranceDto);
    UpdateAssuranceDto updateAssurance(int id, UpdateAssuranceDto updateAssuranceDto);



}
