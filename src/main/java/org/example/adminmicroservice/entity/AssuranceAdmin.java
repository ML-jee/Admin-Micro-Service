package org.example.adminmicroservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "assurance_admin")
@Data
@NoArgsConstructor

public class AssuranceAdmin {
    @Id
    @Column(name="idAssurance",nullable = false,unique = true,updatable = false)
    private int idAssurance;

    private String typeAssurance;
    private String nom;
    private String description;
    private float prix;
}
