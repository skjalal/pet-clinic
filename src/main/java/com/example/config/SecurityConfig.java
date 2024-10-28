package com.example.config;

import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

  @Bean
  @ConfigurationProperties(prefix = "security")
  public SecurityConfigProps securityConfigProps() {
    return new SecurityConfigProps();
  }

  @Bean
  public SecurityFilterChain configure(HttpSecurity http, SecurityConfigProps securityConfigProps)
      throws Exception {
    http.authorizeHttpRequests(securityConfigProps::authConfig)
        .httpBasic(Customizer.withDefaults());
    return http.build();
  }

  @Bean
  public JdbcUserDetailsManager jdbcUserDetailsManager(DataSource dataSource,
      SecurityConfigProps securityConfigProps) {
    return securityConfigProps.userDetailsManager(dataSource);
  }
}
