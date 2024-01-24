package org.example.adminmicroservice.service;

import org.example.adminmicroservice.dto.AddAssuranceDto;
import org.example.adminmicroservice.dto.UpdateAssuranceDto;
import org.example.adminmicroservice.entity.AssuranceAdmin;
import org.example.adminmicroservice.repository.AdminRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminRepository adminRepository;

    //added an AppConfig class to create a Bean method for ModelMapper
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<AddAssuranceDto> getAllAssurances() {
        List<AssuranceAdmin> assurances = adminRepository.findAll();
        return assurances.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public AddAssuranceDto getAssuranceById(int id) {
        AssuranceAdmin assurance = adminRepository.findById(id).orElse(null);
        return convertToDto(assurance);
    }

    @Override
    public AddAssuranceDto saveAssurance(AddAssuranceDto assuranceDto) {
        AssuranceAdmin assurance = convertToEntity(assuranceDto);
        AssuranceAdmin savedAssurance = adminRepository.save(assurance);
        return convertToDto(savedAssurance);
    }

    @Override
    public UpdateAssuranceDto updateAssurance(int id, UpdateAssuranceDto updateAssuranceDto) {
        AssuranceAdmin existingAssurance = adminRepository.findById(id).orElse(null);

        if (existingAssurance != null) {
            // Update the existing assurance with the new values
            existingAssurance.setNom(updateAssuranceDto.getNom());
            existingAssurance.setDescription(updateAssuranceDto.getDescription());
            existingAssurance.setPrix(updateAssuranceDto.getPrix());

            // Save the updated assurance
            AssuranceAdmin updatedAssurance = adminRepository.save(existingAssurance);

            // Convert and return the updated assurance DTO
            return convertToDtoo(updatedAssurance);
        } else {
            // Assurance not found, return null or handle accordingly
            return null;
        }
    }
    private AddAssuranceDto convertToDto(AssuranceAdmin assurance) {
        return modelMapper.map(assurance, AddAssuranceDto.class);
    }

    private UpdateAssuranceDto convertToDtoo(AssuranceAdmin assuranceAdmin){
        return modelMapper.map(assuranceAdmin, UpdateAssuranceDto.class);
    }

    private AssuranceAdmin convertToEntity(AddAssuranceDto assuranceDto) {
        return modelMapper.map(assuranceDto, AssuranceAdmin.class);
    }




}
