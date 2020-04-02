package com.example.demo.artifact_property;

import com.github.javaparser.ast.CompilationUnit;
import java.util.List;
import java.util.Optional;

/**
 * @program: backend
 * @description:
 * @author: laikinmeng
 * @package: ${IntelliJ IDEA}
 * @create: 2020-04-02 17:15
 */
public class ArtifactProperty1 extends ArtifactProperty {

  public ArtifactProperty1() {
    super(1, "Add/Del/Mod");
  }

  @Override
  public boolean isFulfilled(
      List<CompilationUnit> oldVersion,
      List<CompilationUnit> newVersion,
      List<CompilationUnit> changes) {
    for (CompilationUnit compilationUnit : changes) {
      Optional<String> optionalFullyQualifiedClassName =
          APUtils.getFullyQualifiedClassName(compilationUnit);
      if (optionalFullyQualifiedClassName.isPresent()) {
        String fullQualifiedClassName = optionalFullyQualifiedClassName.get();
        boolean existInOldVersion = APUtils.isClassExist(oldVersion, fullQualifiedClassName);
        boolean existInNewVersion = APUtils.isClassExist(newVersion, fullQualifiedClassName);
        if (existInNewVersion && !existInOldVersion) {
          return true;
        }
      }
    }
    return false;
  }
}
