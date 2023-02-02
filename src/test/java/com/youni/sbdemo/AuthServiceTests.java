package com.youni.sbdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AuthServiceTests {
  AuthService authService = new AuthService();

  @Test
  public void testSubNumber() {
    assertEquals(authService.subNumber(10, 8), 2);
  }
  
}
