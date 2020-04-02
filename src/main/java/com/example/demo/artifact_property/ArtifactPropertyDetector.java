package com.example.demo.artifact_property;


import java.util.LinkedList;
import java.util.List;

/**
 * @program: backend
 * @description: Detect artifact property
 * @author: laikinmeng
 * @package: ${IntelliJ IDEA}
 * @create: 2020-04-02 13:39
 */
public class ArtifactPropertyDetector {

  private List<ArtifactProperty> result;

  private List<String> original;

  private List<String> newVersion;

  private List<String> changes;

  public ArtifactPropertyDetector(
      List<String> original, List<String> newVersion, List<String> changes) {
    this.original = original;
    this.newVersion = newVersion;
    this.changes = changes;
    this.result = new LinkedList<>();
  }

  public void detect() {}

  public List<ArtifactProperty> getResult() {
    return this.result;
  }
}
