package edu.mum.cs.cs401.labs.lab02.problem1;

public class Feature {
	private String title;
	private String description;
	private float stimatedTime;
	private float remainingTime;
	private Developer assignedTo;

	public Feature(String title, float stimatedTime) {
		super();
		this.title = title;
		this.stimatedTime = stimatedTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getStimatedTime() {
		return stimatedTime;
	}

	public void setStimatedTime(float stimatedTime) {
		this.stimatedTime = stimatedTime;
	}

	public float getRemainingTime() {
		return remainingTime;
	}

	public void setRemainingTime(float remainingTime) {
		this.remainingTime = remainingTime;
	}

	public Developer getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(Developer assignedTo) {
		this.assignedTo = assignedTo;
	}

}
