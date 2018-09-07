package edu.mum.cs.cs401.labs.lab02.problem1;

import java.util.List;

public class Project {
	private String name;
	private ProjectManager manager;
	private List<Feature> backlog;
	private List<Release> releases;

	public Project(ProjectManager manager) {
		super();
		this.manager = manager;
	}

	public String getName() {
		return name;
	}

	public ProjectManager getManager() {
		return manager;
	}

	public void setManager(ProjectManager manager) {
		this.manager = manager;
	}

	public List<Feature> getBacklog() {
		return backlog;
	}

	public void setBacklog(List<Feature> backlog) {
		this.backlog = backlog;
	}

	public List<Release> getReleases() {
		return releases;
	}

	public void setReleases(List<Release> releases) {
		this.releases = releases;
	}

	public void setName(String name) {
		this.name = name;
	}

}
