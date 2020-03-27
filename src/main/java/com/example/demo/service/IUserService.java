package com.example.demo.service;

import com.example.demo.entity.User;

public interface IUserService {

  public boolean logIn(User user);

  public boolean registry(User user);
}
