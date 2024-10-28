package com.example.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Objects;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

  @Id
  private String username;

  private String password;
  private Boolean enabled;

  @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
  private Set<Role> roles;

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
    User user = (User) o;
    return Objects.equals(username, user.username) && Objects.equals(password, user.password)
        && Objects.equals(enabled, user.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), username, password, enabled);
  }
}
