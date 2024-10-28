package com.example.repository;

import com.example.domain.PetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetTypeRepository extends JpaRepository<PetType, Integer> {

}
