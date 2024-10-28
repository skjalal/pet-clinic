package com.example.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "roles", uniqueConstraints = @UniqueConstraint(columnNames = {"username", "role"}))
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "role")
  private String name;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(referencedColumnName = "username", name = "username")
  private User user;

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
    Role role = (Role) o;
    return Objects.equals(name, role.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), name);
  }
}
