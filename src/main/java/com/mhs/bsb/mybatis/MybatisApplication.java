package com.mhs.bsb.mybatis;

import org.springframework.web.bind.annotation.RestController;

import com.mhs.bsb.mybatis.mapper.UserMapper;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/mybatis/")
public class MybatisApplication {
  private final UserMapper userMapper;
  public MybatisApplication(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  @RequestMapping("/")
  String home() {
    return "spring-mybatiszzz";
  }

  @RequestMapping("/test/")
  Object test() {
    System.out.println(this.userMapper.selectUser(1));
    return this.userMapper.selectUser(1);
  }

}