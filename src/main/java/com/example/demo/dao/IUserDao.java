package com.example.demo.dao;

import com.example.demo.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IUserDao extends JpaRepository<UserInfo, Long> {

  @Query("SELECT u FROM UserInfo u WHERE u.email = :email and u.password = :password")
  public UserInfo findUserByEmailAndPassword(
      @Param("email") String email, @Param("password") String password);
}
