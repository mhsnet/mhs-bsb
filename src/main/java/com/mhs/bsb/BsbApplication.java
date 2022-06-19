package com.mhs.bsb;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class BsbApplication {

  public static void main(String[] args) {
    SpringApplication.run(BsbApplication.class, args);
  }

  @RequestMapping("/")
  String home() {
    return "Hello World!";
  }

}