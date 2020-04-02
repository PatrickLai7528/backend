package com.example.demo.artifact_property;

import com.github.javaparser.ast.CompilationUnit;
import lombok.Getter;

import java.util.List;

/**
 * @program: backend
 * @description:
 * @author: laikinmeng
 * @package: ${IntelliJ IDEA}
 * @create: 2020-04-02 13:57
 **/
public abstract class ArtifactProperty {

	@Getter
	private int id;

	@Getter
	private String group;

//	@Getter
//	private List<CompilationUnit> oldVersion;
//
//	@Getter
//	private List<CompilationUnit> newVersion;
//
//	@Getter
//	private List<CompilationUnit> changes;

	public ArtifactProperty(int id, String group) {
//		this.oldVersion = oldVersion;
//		this.newVersion = newVersion;
//		this.changes = changes;
		this.id = id;
		this.group = group;
	}

	public abstract boolean isFulfilled(List<CompilationUnit> oldVersion, List<CompilationUnit> newVersion, List<CompilationUnit> changes);
}
