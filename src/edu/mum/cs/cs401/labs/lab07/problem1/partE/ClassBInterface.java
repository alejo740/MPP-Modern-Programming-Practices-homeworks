package edu.mum.cs.cs401.labs.lab07.problem1.partE;

public interface ClassBInterface extends ClassAInterface {

	@Override
	default void methodA() {
		System.out.println("methodA from class B");
		
	}
	
	
}
