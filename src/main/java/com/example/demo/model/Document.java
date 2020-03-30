package com.example.demo.model;

import java.util.List;

public class Document {
  private Repository respositer;
  private Committer committer;
  private String ame;
  private String content;
  private List<Requirement> requirementlist;

  public Document(
      Repository respositer,
      Committer committer,
      String ame,
      String content,
      List<Requirement> requirementlist) {
    super();
    this.respositer = respositer;
    this.committer = committer;
    this.ame = ame;
    this.content = content;
    this.requirementlist = requirementlist;
  }

  public Repository getRespositer() {
    return respositer;
  }

  public void setRespositer(Repository respositer) {
    this.respositer = respositer;
  }

  public Committer getCommitter() {
    return committer;
  }

  public void setCommitter(Committer committer) {
    this.committer = committer;
  }

  public String getAme() {
    return ame;
  }

  public void setAme(String ame) {
    this.ame = ame;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public List<Requirement> getRequirementlist() {
    return requirementlist;
  }

  public void setRequirementlist(List<Requirement> requirementlist) {
    this.requirementlist = requirementlist;
  }
}
