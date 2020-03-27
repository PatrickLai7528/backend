package com.example.demo.model;

import java.sql.Date;

public class Commit {
	private Committer committer;
	private Date date;
	private Commit parent;
	private FileTreeNode[] oldTree;
	private FileTreeNode[] newTree;

	public Commit(Committer committer, Date date, Commit parent, FileTreeNode[] oldTree, FileTreeNode[] newTree) {
		super();
		this.committer = committer;
		this.date = date;
		this.parent = parent;
		this.oldTree = oldTree;
		this.newTree = newTree;
	}

	public Committer getCommitter() {
		return committer;
	}

	public void setCommitter(Committer committer) {
		this.committer = committer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Commit getParent() {
		return parent;
	}

	public void setParent(Commit parent) {
		this.parent = parent;
	}

	public FileTreeNode[] getOldTree() {
		return oldTree;
	}

	public void setOldTree(FileTreeNode[] oldTree) {
		this.oldTree = oldTree;
	}

	public FileTreeNode[] getNewTree() {
		return newTree;
	}

	public void setNewTree(FileTreeNode[] newTree) {
		this.newTree = newTree;
	}

}
