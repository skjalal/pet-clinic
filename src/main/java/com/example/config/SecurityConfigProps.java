package com.example.config;

import javax.sql.DataSource;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@Getter
@Setter
public class SecurityConfigProps {

  private String[] ignorePaths;
  private Sql sql;

  public void authConfig(
      AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry registry) {
    registry.requestMatchers(ignorePaths).permitAll().anyRequest().authenticated();
  }

  public JdbcUserDetailsManager userDetailsManager(DataSource dataSource) {
    var manager = new JdbcUserDetailsManager(dataSource);
    manager.setUsersByUsernameQuery(sql.findUserByUsername);
    manager.setAuthoritiesByUsernameQuery(sql.findRoleByUsername);
    return manager;
  }

  @Getter
  @Setter
  private static class Sql {

    private String findUserByUsername;
    private String findRoleByUsername;
  }
}
