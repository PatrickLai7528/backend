package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import com.example.demo.util.APIResponse;
import com.example.demo.util.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class UserController {

  private final IUserService userService;

  @Autowired
  public UserController(IUserService userService) {
    this.userService = userService;
  }

  @PostMapping("login")
  public APIResponse<String> logIn(@RequestBody User user) {
    System.out.println(user);
    this.userService.logIn(user);
    return ResponseUtils.ok("OK", "OK");
  }
}
