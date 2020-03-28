package com.example.demo.model;

public class Controller {
  private Controller() {}

  private static final Controller controller = new Controller();

  public static Controller request() {
    return controller;
  }
}
