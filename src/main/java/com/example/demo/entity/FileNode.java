package com.example.demo.entity;

public class FileNode {

  public static enum Type {
    FOLDER,
    FILE
  }

  private String sha;

  private String fullyQualifiedName;

  private String simpleName;

  private Type type;

  private FileNode[] subTrees;
}
