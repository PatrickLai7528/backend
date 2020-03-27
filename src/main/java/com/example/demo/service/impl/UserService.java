package com.example.demo.service.impl;

import com.example.demo.dao.IUserDao;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.IUserService;
import com.example.demo.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

  private final IUserDao userDao;

  @Autowired
  public UserService(IUserDao userDao) {
    this.userDao = userDao;
  }

  private String hashPassword(String unHashed) {
    return MD5Utils.md5Hash(unHashed);
  }

  @Override
  public boolean createNewUserInfo(UserInfo userInfo) {
    try {
      userInfo.setPassword(this.hashPassword(userInfo.getPassword()));
      this.userDao.save(userInfo);
      return true;
    } catch (DataIntegrityViolationException e) { // 不確定是否這個異常
      return false;
    }
  }

  @Override
  public boolean isUserExist(UserInfo userInfo) {
    return null != this.findUserByEmailAndPassword(userInfo);
  }

  @Override
  public UserInfo findUserByEmailAndPassword(UserInfo userInfo) {
    String hashedPassword = this.hashPassword(userInfo.getPassword());
    String email = userInfo.getEmail();
    return userDao.findUserByEmailAndPassword(email, hashedPassword);
  }
}
