package com.example.demo.model;

import java.util.List;

public class Method {
  private Repository repository;
  private Committer committer;
  private String name;
  private java.lang.Class itsclass;
  private String content;
  private Boolean ifNew;
  private Boolean ifChanged;
  private Boolean fDeleted;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  private List<String> inheritancerelashionship;

  public Method(
      Repository repository,
      Committer committer,
      String name,
      java.lang.Class itsclass,
      String content,
      Boolean ifNew,
      Boolean ifChanged,
      Boolean fDeleted,
      List<String> inheritancerelashionship) {
    super();
    this.repository = repository;
    this.committer = committer;
    this.name = name;
    this.itsclass = itsclass;
    this.content = content;
    this.ifNew = ifNew;
    this.ifChanged = ifChanged;
    this.fDeleted = fDeleted;
    this.inheritancerelashionship = inheritancerelashionship;
  }

  public Repository getRepository() {
    return repository;
  }

  public void setRepository(Repository repository) {
    this.repository = repository;
  }

  public Committer getCommitter() {
    return committer;
  }

  public void setCommitter(Committer committer) {
    this.committer = committer;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public java.lang.Class getItsclass() {
    return itsclass;
  }

  public void setItsclass(java.lang.Class itsclass) {
    this.itsclass = itsclass;
  }

  public Boolean getIfNew() {
    return ifNew;
  }

  public void setIfNew(Boolean ifNew) {
    this.ifNew = ifNew;
  }

  public Boolean getIfChanged() {
    return ifChanged;
  }

  public void setIfChanged(Boolean ifChanged) {
    this.ifChanged = ifChanged;
  }

  public Boolean getfDeleted() {
    return fDeleted;
  }

  public void setfDeleted(Boolean fDeleted) {
    this.fDeleted = fDeleted;
  }

  public List<String> getInheritancerelashionship() {
    return inheritancerelashionship;
  }

  public void setInheritancerelashionship(List<String> inheritancerelashionship) {
    this.inheritancerelashionship = inheritancerelashionship;
  }
}
