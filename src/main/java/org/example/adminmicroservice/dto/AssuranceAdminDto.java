package org.example.adminmicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssuranceAdminDto {
    private int idAssurance;
    private String typeAssurance;
    private String nom;
    private String description;
    private float prix;
}
