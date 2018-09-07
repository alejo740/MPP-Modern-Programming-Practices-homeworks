package edu.mum.cs.cs401.labs.lab08.problem1.partH;

import java.io.PrintStream;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		Consumer<String> print1 = System.out::println;
		Consumer<String> print2 = p -> System.out.println(p);
		
		print1.accept("Hello world p1");
		print2.accept("Hello world p2");
	}

}
