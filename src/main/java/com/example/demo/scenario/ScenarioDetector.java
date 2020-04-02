package com.example.demo.scenario;

import com.example.demo.artifact_property.ArtifactProperty;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: backend
 * @description:
 * @author: laikinmeng
 * @package: ${IntelliJ IDEA}
 * @create: 2020-04-02 19:19
 */
public class ScenarioDetector implements IScenarioDetector {

  private List<CompilationUnit> parseToCompilationUnit(List<String> sources) {
    return sources.stream().map(StaticJavaParser::parse).collect(Collectors.toList());
  }

  @Override
  public void detect(List<String> original, List<String> newVersion, List<String> changes) {
    List<Scenario> scenarioList = ScenarioFactory.getInstance().getAllScenario();
    List<Scenario> detected = new ArrayList<>();
    for (Scenario scenario : scenarioList) {
      List<ArtifactProperty> artifactPropertyList = scenario.getRequiredArtifactProperties();
      boolean isAllFulfilled = true;
      for (ArtifactProperty artifactProperty : artifactPropertyList) {
        if (!artifactProperty.isFulfilled(
            parseToCompilationUnit(original),
            parseToCompilationUnit(newVersion),
            parseToCompilationUnit(changes))) {
          isAllFulfilled = false;
          break;
        }
      }
      if (isAllFulfilled) {
        detected.add(scenario);
      }
    }
  }

  @Override
  public Scenario getResult() {
    return null;
  }
}
