package com.example.repository;

import com.example.domain.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet, Integer> {

}
