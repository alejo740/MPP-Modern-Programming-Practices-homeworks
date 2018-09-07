package test;

public class House {

	private double size = 0;
	private String name;
	private Room room;

	public House() {
		System.out.println("Casa constructor");
	}

	public House(double size) {
		this.size = size;
	}

	public House(String name) {
		this.name = name;
		System.out.println("Casa constructor with " + name);
	}

	public House(double size, String name, Room room) {
		super();
		this.size = size;
		this.name = name;
		this.room = room;
	}

	public double getSize() {
		return size;
	}

}
