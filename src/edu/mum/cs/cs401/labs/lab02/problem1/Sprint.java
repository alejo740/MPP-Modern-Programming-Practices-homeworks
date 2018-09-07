package edu.mum.cs.cs401.labs.lab02.problem1;

import java.util.List;

public class Sprint {
	private float startingDate;
	private float endingDate;
	private List<Feature> features;

	public Sprint(List<Feature> features) {
		super();
		this.features = features;
	}

	public float getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(float startingDate) {
		this.startingDate = startingDate;
	}

	public float getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(float endingDate) {
		this.endingDate = endingDate;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

}
