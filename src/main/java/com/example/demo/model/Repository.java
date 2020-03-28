package com.example.demo.model;

import com.sun.javafx.collections.MappingChange.Map;
import java.sql.Date;

public class Repository {
  private Map<String, FileTreeNode[]> fileTrees; // String是Commit的SHA;
  private Requirement requirement;
  private Branch[] branches;
  private String defaultBranch;
  private Number forks;
  private Number stars;
  private String fullName;
  private String name;
  private Boolean ifPrivate;
  private String id;
  private String description;
  private String homepage;
  private Date createdAt;
  private Date updatedAt;
  private String gitHubUrl;
  private String language;

  public Repository(
      Map<String, FileTreeNode[]> fileTrees,
      Requirement requirement,
      Branch[] branches,
      String defaultBranch,
      Number forks,
      Number stars,
      String fullName,
      String name,
      Boolean ifPrivate,
      String id,
      String description,
      String homepage,
      Date createdAt,
      Date updatedAt,
      String gitHubUrl,
      String language) {
    super();
    this.fileTrees = fileTrees;
    this.requirement = requirement;
    this.branches = branches;
    this.defaultBranch = defaultBranch;
    this.forks = forks;
    this.stars = stars;
    this.fullName = fullName;
    this.name = name;
    this.ifPrivate = ifPrivate;
    this.id = id;
    this.description = description;
    this.homepage = homepage;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.gitHubUrl = gitHubUrl;
    this.language = language;
  }

  public Map<String, FileTreeNode[]> getFileTrees() {
    return fileTrees;
  }

  public void setFileTrees(Map<String, FileTreeNode[]> fileTrees) {
    this.fileTrees = fileTrees;
  }

  public Requirement getRequirement() {
    return requirement;
  }

  public void setRequirement(Requirement requirement) {
    this.requirement = requirement;
  }

  public Branch[] getBranches() {
    return branches;
  }

  public void setBranches(Branch[] branches) {
    this.branches = branches;
  }

  public String getDefaultBranch() {
    return defaultBranch;
  }

  public void setDefaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
  }

  public Number getForks() {
    return forks;
  }

  public void setForks(Number forks) {
    this.forks = forks;
  }

  public Number getStars() {
    return stars;
  }

  public void setStars(Number stars) {
    this.stars = stars;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getIfPrivate() {
    return ifPrivate;
  }

  public void setIfPrivate(Boolean ifPrivate) {
    this.ifPrivate = ifPrivate;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getHomepage() {
    return homepage;
  }

  public void setHomepage(String homepage) {
    this.homepage = homepage;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getGitHubUrl() {
    return gitHubUrl;
  }

  public void setGitHubUrl(String gitHubUrl) {
    this.gitHubUrl = gitHubUrl;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
}
