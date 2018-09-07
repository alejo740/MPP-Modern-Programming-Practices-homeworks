package edu.mum.cs.cs401.labs.lab07.problem5;

public abstract class Duck implements FlyWithWings, Quack {
	
	public void swim() {
		System.out.println("swimming");
	}
	
	public abstract void display();
}
