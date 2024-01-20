package org.example.adminmicroservice.service;

import org.example.adminmicroservice.dto.AssuranceAdminDto;
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
    public List<AssuranceAdminDto> getAllAssurances() {
        List<AssuranceAdmin> assurances = adminRepository.findAll();
        return assurances.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public AssuranceAdminDto getAssuranceById(int id) {
        AssuranceAdmin assurance = adminRepository.findById(id).orElse(null);
        return convertToDto(assurance);
    }

    @Override
    public AssuranceAdminDto saveAssurance(AssuranceAdminDto assuranceDto) {
        AssuranceAdmin assurance = convertToEntity(assuranceDto);
        AssuranceAdmin savedAssurance = adminRepository.save(assurance);
        return convertToDto(savedAssurance);
    }
    private AssuranceAdminDto convertToDto(AssuranceAdmin assurance) {
        return modelMapper.map(assurance, AssuranceAdminDto.class);
    }

    private AssuranceAdmin convertToEntity(AssuranceAdminDto assuranceDto) {
        return modelMapper.map(assuranceDto, AssuranceAdmin.class);
    }


}
