package com.example.demo.scenario;

import java.util.List;

/**
 * @program: backend
 * @description: Detect which scenario is happening
 * @author: laikinmeng
 * @package: ${IntelliJ IDEA}
 * @create: 2020-04-01 12:29
 */
public interface IScenarioDetector {
  public void detect(List<String> original, List<String> newVersion, List<String> changes);

  public Scenario getResult();
}
