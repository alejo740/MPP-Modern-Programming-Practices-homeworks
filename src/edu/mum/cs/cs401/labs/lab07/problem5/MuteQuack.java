package edu.mum.cs.cs401.labs.lab07.problem5;

public interface MuteQuack extends Quack {

	@Override
	default void quack() {
		System.out.println("cannot quack");
	}

}
