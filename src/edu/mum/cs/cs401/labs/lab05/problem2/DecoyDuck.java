package edu.mum.cs.cs401.labs.lab05.problem2;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("displaying Decoy duck");
	}

}
