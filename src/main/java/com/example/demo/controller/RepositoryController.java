package com.example.demo.controller;

import com.example.demo.entity.Repository;
import com.example.demo.util.APIResponse;
import com.example.demo.util.ResponseUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("repository")
public class RepositoryController {

  @GetMapping("test")
  public APIResponse<Void> test() {
    return ResponseUtils.ok("OKOKKKK");
  }

  @PostMapping("/import")
  @CrossOrigin("http://localhost:3000")
  public APIResponse<Void> importRepositoryFromGitHub(@RequestBody Repository repository) {
    return ResponseUtils.ok("Ok");
  }
}
