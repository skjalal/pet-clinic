package com.example.repository;

import com.example.domain.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Integer> {

}
