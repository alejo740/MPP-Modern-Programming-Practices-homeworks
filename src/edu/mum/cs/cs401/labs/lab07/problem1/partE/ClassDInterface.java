package edu.mum.cs.cs401.labs.lab07.problem1.partE;

public interface ClassDInterface extends ClassBInterface, ClassCInterface {

	@Override
	default void methodA() {
		// TODO Auto-generated method stub
		ClassBInterface.super.methodA();
	}

}
