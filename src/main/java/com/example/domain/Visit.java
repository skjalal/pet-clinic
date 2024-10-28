package com.example.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

  @Column(name = "visit_date")
  private LocalDate date;

  private String description;

  @ManyToOne
  @JoinColumn(name = "pet_id")
  private Pet pet;

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
    Visit visit = (Visit) o;
    return Objects.equals(date, visit.date) && Objects.equals(description, visit.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), date, description);
  }
}
