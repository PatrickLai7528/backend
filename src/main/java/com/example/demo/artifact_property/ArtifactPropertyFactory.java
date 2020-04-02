package com.example.demo.artifact_property;

/**
 * @program: backend
 * @description:
 * @author: laikinmeng
 * @package: ${IntelliJ IDEA}
 * @create: 2020-04-02 16:34
 **/
public class ArtifactPropertyFactory {

	private static final ArtifactPropertyFactory instance = new ArtifactPropertyFactory();

	private ArtifactPropertyFactory() {
	}

	public static ArtifactPropertyFactory getInstance() {
		return instance;
	}

	public ArtifactProperty getArtifactPropertyById(int id) {
		switch (id) {
			case 1:
				return new ArtifactProperty1();
			case 2:
				return new ArtifactProperty2();
			default:
				throw new RuntimeException();
		}
	}
}
