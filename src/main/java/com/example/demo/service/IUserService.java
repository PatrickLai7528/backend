package com.example.demo.service;

import com.example.demo.entity.UserInfo;

public interface IUserService {

  /**
   * @param userInfo 待新增數據
   * @return 是否成功插入
   */
  public boolean createNewUserInfo(UserInfo userInfo);

  /**
   * @param userInfo 查詢這個用戶是否已經存在
   * @return 如果存在返回true，反之false
   */
  public boolean isUserExist(UserInfo userInfo);

  public UserInfo findUserByEmailAndPassword(UserInfo userInfo);
}
