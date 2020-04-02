package com.example.demo.artifact_property;

import com.github.javaparser.ast.CompilationUnit;
import java.util.List;

/**
 * @program: backend
 * @description:
 * @author: laikinmeng
 * @package: ${IntelliJ IDEA}
 * @create: 2020-04-02 17:53
 */
public class ArtifactProperty3 extends ArtifactProperty {
  public ArtifactProperty3() {
    super(3, "Add/Del/Mod");
  }

  @Override
  public boolean isFulfilled(
      List<CompilationUnit> oldVersion,
      List<CompilationUnit> newVersion,
      List<CompilationUnit> changes) {
    return false;
  }
}
