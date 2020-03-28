package com.example.demo.model;

public class FileTreeNode {
  private String path; // 文件名
  private Enum type; // "FILE" or "FOLDER"
  private String sha; // ID
  private String
      gitHubUrl; // "https://api.github.com/repos/PatrickLai7528/android-chat-in-4-patterns/git/blobs/3d82d128859b45fadcc57fad533f053a8447afc5"
  private String content; // 如果Type為FOLDER，則為NULL
  private FileTreeNode[] subTrees; // Or Null，如果Type為FILE，則為NULL

  public FileTreeNode(
      String path,
      Enum type,
      String sha,
      String gitHubUrl,
      String content,
      FileTreeNode[] subTrees) {
    super();
    this.path = path;
    this.type = type;
    this.sha = sha;
    this.gitHubUrl = gitHubUrl;
    this.content = content;
    this.subTrees = subTrees;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Enum getType() {
    return type;
  }

  public void setType(Enum type) {
    this.type = type;
  }

  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public String getGitHubUrl() {
    return gitHubUrl;
  }

  public void setGitHubUrl(String gitHubUrl) {
    this.gitHubUrl = gitHubUrl;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public FileTreeNode[] getSubTrees() {
    return subTrees;
  }

  public void setSubTrees(FileTreeNode[] subTrees) {
    this.subTrees = subTrees;
  }
}
