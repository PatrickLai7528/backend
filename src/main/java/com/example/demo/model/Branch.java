package com.example.demo.model;

import java.sql.Date;

public class Branch {

  private String name;
  private Commit[] commits;
  private Date createAt;
  private Date updatedAt;

  public Branch(String name, Commit[] commits, Date createAt, Date updatedAt) {
    super();
    this.name = name;
    this.commits = commits;
    this.createAt = createAt;
    this.updatedAt = updatedAt;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Commit[] getCommits() {
    return commits;
  }

  public void setCommits(Commit[] commits) {
    this.commits = commits;
  }

  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }
}
