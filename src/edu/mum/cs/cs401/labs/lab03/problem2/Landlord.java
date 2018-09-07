package edu.mum.cs.cs401.labs.lab03.problem2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	private String name;
	private float income;
	private List<Building> buildings;

	public Landlord(String name) {
		super();
		this.name = name;
		buildings = new ArrayList<>();
	}

	public float calculateBuildingsProfit() {
		float total = 0;
		for (Building building : buildings) {
			total += building.getTotalBuildingProfits();
		}
		return total;
	}

	public void addBuilding(String address) {
		buildings.add(new Building(address));
	}

	public void addBuilding(Building building) {
		buildings.add(building);
	}

	public String getName() {
		return name;
	}

	public float getIncome() {
		return income;
	}

	public List<Building> getBuildings() {
		return buildings;
	}

}
