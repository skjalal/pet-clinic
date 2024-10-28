package com.example.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Objects;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "owners")
public class Owner extends Person {

  private String address;
  private String city;
  private String telephone;

  @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
  private Set<Pet> pets;

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
    Owner owner = (Owner) o;
    return Objects.equals(address, owner.address) && Objects.equals(city, owner.city)
        && Objects.equals(telephone, owner.telephone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), address, city, telephone);
  }
}
