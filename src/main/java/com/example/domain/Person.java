package com.example.domain;

import jakarta.persistence.MappedSuperclass;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class Person extends BaseEntity {

  private String firstName;
  private String lastName;

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
    Person person = (Person) o;
    return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), firstName, lastName);
  }
}
