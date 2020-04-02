package com.example.demo.artifact_property;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.TypeDeclaration;

import java.util.List;
import java.util.Optional;

/**
 * @program: backend
 * @description:
 * @author: laikinmeng
 * @package: ${IntelliJ IDEA}
 * @create: 2020-04-02 17:22
 **/
public class APUtils {

	public static Optional<String> getFullyQualifiedClassName(CompilationUnit cu) {
		Optional<TypeDeclaration<?>> optionalTypeDeclaration = cu.getPrimaryType();
		if (optionalTypeDeclaration.isPresent()) {
			TypeDeclaration<?> typeDeclaration = optionalTypeDeclaration.get();
			if (typeDeclaration.isClassOrInterfaceDeclaration()) {
				return typeDeclaration.getFullyQualifiedName();
			}
		}
		return Optional.empty();
	}

	public static boolean isClassExist(List<CompilationUnit> parsedFiles, String fullyQualifiedClassName) {
		for (CompilationUnit compilationUnit : parsedFiles) {
			Optional<String> optionalFullyQualifiedClassName = getFullyQualifiedClassName(compilationUnit);
			if (optionalFullyQualifiedClassName.isPresent()) {
				if (optionalFullyQualifiedClassName.get().equals(fullyQualifiedClassName)) {
					return true;
				}
			}
		}
		return false;
	}
}
