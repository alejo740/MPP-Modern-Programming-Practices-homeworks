package edu.mum.cs.cs401.labs.lab05.problem2;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("displaying Redhead duck");
	}

}
