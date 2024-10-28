package com.example.repository;

import com.example.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {

}
