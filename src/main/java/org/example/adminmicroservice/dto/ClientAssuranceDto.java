package org.example.adminmicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientAssuranceDto {
    private String cin;
    private String nom;
    private String prenom;
    private int idAssurance;
}
