package edu.mum.cs.cs401.labs.lab03.problem2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private String address;
	private float maintenanceCost;
	private float totalRents;
	private List<Apartment> apartments;

	public Building(String address) {
		super();
		this.address = address;
		apartments = new ArrayList<>();
	}

	public float getTotalBuildingProfits() {
		return totalRents - maintenanceCost;
	}

	public void calculateApartmentsRent() {
		totalRents = 0;
		for (Apartment apartment : apartments) {
			totalRents += apartment.getRent();
		}
	}

	public void addApartment(Apartment apartment) {
		apartments.add(apartment);
		totalRents += apartment.getRent();
	}

	public void addApartment(int numberId, float rent) {
		apartments.add(new Apartment(numberId, rent, this));
		totalRents += rent;
	}

	public String getAddress() {
		return address;
	}

	public float getMaintenanceCost() {
		return maintenanceCost;
	}

	public void setMaintenanceCost(float maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public float getTotalRents() {
		return totalRents;
	}

}
