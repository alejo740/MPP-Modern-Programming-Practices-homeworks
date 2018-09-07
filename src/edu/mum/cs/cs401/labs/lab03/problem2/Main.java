package edu.mum.cs.cs401.labs.lab03.problem2;

public class Main {

	public static void main(String[] args) {

		Building building1 = new Building("140 Street");
		building1.setMaintenanceCost(500);
		building1.addApartment(101, 400);
		building1.addApartment(102, 300);
		building1.addApartment(103, 350);

		Building building2 = new Building("Union Street");
		building2.setMaintenanceCost(250);
		building2.addApartment(101, 200);
		building2.addApartment(102, 150);
		building2.addApartment(103, 160);

		Landlord landlord1 = new Landlord("EDWIN");
		landlord1.addBuilding(building1);
		landlord1.addBuilding(building2);

		float profits = landlord1.calculateBuildingsProfit();
		System.out.println("Total profits landford1: " + profits);
	}

}
