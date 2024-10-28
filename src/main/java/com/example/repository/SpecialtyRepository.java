package com.example.repository;

import com.example.domain.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialtyRepository extends JpaRepository<Specialty, Integer> {

}
