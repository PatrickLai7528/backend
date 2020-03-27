package com.example.demo.service.impl;

import com.example.demo.dao.ICRUD;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

  private final ICRUD<User> userDao;

  @Autowired
  public UserService(ICRUD<User> userDao) {
    this.userDao = userDao;
  }

  @Override
  public boolean logIn(User user) {
    this.userDao.addOne(user);
    return true;
  }

  @Override
  public boolean registry(User user) {
    return false;
  }
}
