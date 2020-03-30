package com.example.demo.entity;

import lombok.*;

/**
 * @program: backend
 * @description: response class for posting https://github.com/login/oauth/access_token in order to
 *     trade token
 * @author: laikinmeng
 * @package: ${IntelliJ IDEA}
 * @create: 2020-03-28 22:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class GitHubAccessTokenResponse {

  private String access_token;

  private String token_type;

  private String token;
}
