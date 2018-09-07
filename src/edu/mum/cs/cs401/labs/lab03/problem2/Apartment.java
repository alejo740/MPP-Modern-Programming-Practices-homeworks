package edu.mum.cs.cs401.labs.lab03.problem2;

public class Apartment {
	private int numberId;
	private float rent;
	private Building building;

	public Apartment(int numberId, float rent, Building building) {
		super();
		this.numberId = numberId;
		this.rent = rent;
		this.building = building;
	}

	public int getNumberId() {
		return numberId;
	}

	public float getRent() {
		return rent;
	}

	public void setRent(float rent) {
		this.rent = rent;
		building.calculateApartmentsRent();
	}

	public Building getBuilding() {
		return building;
	}

}
