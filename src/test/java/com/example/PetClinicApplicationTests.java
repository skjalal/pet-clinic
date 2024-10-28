package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PetClinicApplicationTests {

  @Test
  void contextLoads() {
    assertEquals("3.3.5", SpringBootVersion.getVersion());
  }

}
