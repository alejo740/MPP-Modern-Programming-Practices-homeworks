package edu.mum.cs.cs401.labs.lab02.problem1;

import java.util.List;

public class Release {
	private String versionName;
	private float date;
	private String notes;
	private List<Sprint> sprints;

	public Release(List<Sprint> sprints) {
		super();
		this.sprints = sprints;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public float getDate() {
		return date;
	}

	public void setDate(float date) {
		this.date = date;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public List<Sprint> getSprints() {
		return sprints;
	}

	public void setSprints(List<Sprint> sprints) {
		this.sprints = sprints;
	}

}
