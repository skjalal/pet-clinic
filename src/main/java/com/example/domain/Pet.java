package com.example.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pets")
public class Pet extends NamedEntity {

  private LocalDate birthDate;

  @ManyToOne
  @JoinColumn(name = "type_id")
  private PetType type;

  @ManyToOne
  @JoinColumn(name = "owner_id")
  private Owner owner;

  @OneToMany(mappedBy = "pet", fetch = FetchType.EAGER)
  private Set<Visit> visits;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Pet pet = (Pet) o;
    return Objects.equals(birthDate, pet.birthDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), birthDate);
  }
}
