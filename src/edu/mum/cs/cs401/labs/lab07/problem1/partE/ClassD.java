package edu.mum.cs.cs401.labs.lab07.problem1.partE;

public class ClassD extends ClassAux implements ClassBInterface, ClassCInterface {
	
	public static void main(String[] args) {
		ClassBInterface b = new ClassD();
		b.methodA();
		//System.out.println(b.methodA());
	}


}
