package com.example.demo.scenario;

import com.example.demo.artifact_property.ArtifactProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @program: backend
 * @description: Scenario
 * @author: laikinmeng
 * @package: ${IntelliJ IDEA}
 * @create: 2020-04-02 13:32
 */
@ToString
@AllArgsConstructor
public class Scenario {

  @Getter private int id;

  @Getter private String group;

  @Getter private String name;

  @Getter private List<ArtifactProperty> requiredArtifactProperties;
}
