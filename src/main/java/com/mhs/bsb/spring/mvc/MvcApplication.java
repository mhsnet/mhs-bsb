package com.mhs.bsb.spring.mvc;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/spring-mvc/")
public class MvcApplication {

  @RequestMapping("/")
  String home() {
    return "spring-mvczzvv";
  }

}