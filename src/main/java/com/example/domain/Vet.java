package com.example.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "vets")
public class Vet extends Person {

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
      inverseJoinColumns = @JoinColumn(name = "specialty_id"))
  private Set<Specialty> specialties = new HashSet<>();
}
