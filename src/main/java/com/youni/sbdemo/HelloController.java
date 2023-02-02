package com.youni.sbdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  HelloService helloService = new HelloService();

  @RequestMapping("/hello")
  public String hello() {
    return "Hello Spring Boot";
  }

  @RequestMapping("/users")
  public String getAllUser() {
    return "This is all user";
  }

  @RequestMapping("/calculate-sum")
  public int calculateSum() {
    return helloService.calculateSum(10, 10);
  }
}