package com.example.demo.controller;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.IUserService;
import com.example.demo.util.APIResponse;
import com.example.demo.util.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("auth")
public class UserController {

  private final IUserService userService;
  private static final String clientID = "Iv1.61514a0dc0e75d1e";
  private static final String clientSecret = "5684cf24b2dc1613c82e1c1c11fb3a9ac6abcf3c";

  @Autowired
  public UserController(IUserService userService) {
    this.userService = userService;
  }

  @PostMapping("login")
  public APIResponse<? extends Object> logIn(@RequestBody UserInfo userInfo) {
    boolean success = userService.isUserExist(userInfo);
    if (success) {
      return ResponseUtils.ok("登錄成功");
    } else {
      return ResponseUtils.notOk("用戶信息不存在");
    }
  }

  @PostMapping("registry")
  public APIResponse<? extends Object> registry(@RequestBody UserInfo userInfo) {
    boolean success = userService.createNewUserInfo(userInfo);
    if (success) {
      return ResponseUtils.ok("注冊成功");
    } else {
      return ResponseUtils.notOk("用戶已存在");
    }
  }

  public APIResponse<?> getGitHubAccessToken(@RequestParam String code) {
    RestTemplate restTemplate = new RestTemplate();
    // "https://github.com/login/oauth/access_token?" +
    //				`client_id=${clientID}&` +
    //				`client_secret=${clientSecret}&` +
    //				`code=${requestToken}`,
    String url =
        String.format(
            "https://github.com/login/oauth/access_token?client_id=%s&client_secret=%s&code=%s",
            clientID, clientSecret, code);
  }
}
