package com.bootcamp.demo_helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody

public class HelloController {
  @GetMapping(value = "/hello")
  public String helloworld() {
      return "Hello. Welcome to Spring Boot!!!!";
  }
  
}
