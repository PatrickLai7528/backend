package com.example.demo.model;

public class User {
	private String email;
	private String password;
	private String gitHubID;
	private Long createAt;

	public User(String email, String password, String gitHubID, Long createAt) {
		super();
		this.email = email;
		this.password = password;
		this.gitHubID = gitHubID;
		this.createAt = createAt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGitHubID() {
		return gitHubID;
	}

	public void setGitHubID(String gitHubID) {
		this.gitHubID = gitHubID;
	}

	public Long getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}

}
