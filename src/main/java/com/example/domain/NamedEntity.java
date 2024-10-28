package com.example.domain;

import jakarta.persistence.MappedSuperclass;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class NamedEntity extends BaseEntity {

  private String name;

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
    NamedEntity that = (NamedEntity) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), name);
  }
}
