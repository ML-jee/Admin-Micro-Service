package org.example.adminmicroservice.repository;

import org.example.adminmicroservice.entity.AssuranceAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AssuranceAdmin,Integer> {
}
