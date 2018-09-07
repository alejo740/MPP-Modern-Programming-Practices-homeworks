package edu.mum.cs.cs401.labs.lab05.problem2;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("cannot quack");
	}

}
