package edu.mum.cs.cs401.labs.lab07.problem5;

public class DecoyDuck extends Duck implements CannotFly, MuteQuack {

	@Override
	public void display() {
		System.out.println("displaying Decoy duck");
	}

}
