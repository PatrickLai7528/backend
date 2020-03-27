package com.example.demo.model;

import java.util.List;

public class Class {
	private Repository repository;
	private Committer committer;
	private String name;
	private List<Method> methodList;
	private List<Requirement> requirementList;
	private Boolean ifNew;
	private Boolean ifChanged;
	private Boolean fDeleted;
	private String Content;
	private List<String> inheritancerelashionship;

	public Class(Repository repository, Committer committer, String name, List<Method> methodList,
			List<Requirement> requirementList, Boolean ifNew, Boolean ifChanged, Boolean fDeleted, String content,
			List<String> inheritancerelashionship) {
		super();
		this.repository = repository;
		this.committer = committer;
		this.name = name;
		this.methodList = methodList;
		this.requirementList = requirementList;
		this.ifNew = ifNew;
		this.ifChanged = ifChanged;
		this.fDeleted = fDeleted;
		Content = content;
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

	public List<Method> getMethodList() {
		return methodList;
	}

	public void setMethodList(List<Method> methodList) {
		this.methodList = methodList;
	}

	public List<Requirement> getRequirementList() {
		return requirementList;
	}

	public void setRequirementList(List<Requirement> requirementList) {
		this.requirementList = requirementList;
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

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public List<String> getInheritancerelashionship() {
		return inheritancerelashionship;
	}

	public void setInheritancerelashionship(List<String> inheritancerelashionship) {
		this.inheritancerelashionship = inheritancerelashionship;
	}

}
