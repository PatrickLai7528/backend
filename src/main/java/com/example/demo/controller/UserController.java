package com.example.demo.controller;

import com.example.demo.entity.GitHubAccessTokenResponse;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.IUserService;
import com.example.demo.util.APIResponse;
import com.example.demo.util.ResponseUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

  @GetMapping("access_token")
  @CrossOrigin("http://localhost:3000")
  public APIResponse<?> getGitHubAccessToken(@RequestParam String code) {
    System.out.println("i am in");

    RestTemplate restTemplate = new RestTemplate();
    String url =
        String.format(
            "https://github.com/login/oauth/access_token?client_id=%s&client_secret=%s&code=%s",
            clientID, clientSecret, code);

    // create headers
    HttpHeaders headers = new HttpHeaders();
    // set `accept` header
    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

    // create a map for post parameters
    Map<String, Object> map = new HashMap<>();
    // build the request
    HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, headers);

    // send POST request
    ResponseEntity<GitHubAccessTokenResponse> response =
        restTemplate.postForEntity(url, entity, GitHubAccessTokenResponse.class);
    return ResponseUtils.ok("OK", response.getBody().getAccess_token());
  }
}
