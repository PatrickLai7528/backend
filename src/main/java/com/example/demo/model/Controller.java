package com.example.demo.model;

public class Controller {
	private Controller() {

	}

	private final static Controller controller = new Controller();

	public static Controller request() {
		return controller;
	}
}
