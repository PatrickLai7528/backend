package com.example.demo.scenario;

import com.example.demo.artifact_property.ArtifactProperty;
import com.example.demo.artifact_property.ArtifactPropertyFactory;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: backend
 * @description:
 * @author: laikinmeng
 * @package: ${IntelliJ IDEA}
 * @create: 2020-04-02 15:28
 */
public class ScenarioFactory {
  private static final ScenarioFactory instance = new ScenarioFactory();
  private List<String[]> csvData;

  private ScenarioFactory() {
    try {
      CSVReader reader;
      reader = new CSVReader(new FileReader("src/main/java/com/example/demo/scenario/table.csv"));
      this.csvData = reader.readAll();
      System.out.println(this.csvData);
    } catch (IOException | CsvException e) {
      e.printStackTrace();
    }
  }

  public static ScenarioFactory getInstance() {
    return instance;
  }

  public Scenario getScenarioById(int id) {
    String[] csvRow = this.csvData.get(id - 1);
    String group = csvRow[1];
    String name = csvRow[2];
    List<ArtifactProperty> artifactProperties = new ArrayList<>();
    String apIdsStr = csvRow[3].replace("[", "").replace("]", "");
    for (String apId : apIdsStr.split(",")) {
      artifactProperties.add(
          ArtifactPropertyFactory.getInstance()
              .getArtifactPropertyById(Integer.parseInt(apId.trim())));
    }
    return new Scenario(id, group, name, artifactProperties);
  }

  public List<Scenario> getAllScenario() {
    List<Scenario> scenarioList = new LinkedList<>();
    for (int i = 1; i <= 18; i++) {
      scenarioList.add(getScenarioById(i));
    }
    return scenarioList;
  }
}
