package edu.mum.cs.cs401.labs.lab09.problem4;

import java.util.stream.IntStream;

public class MainClass {

	public static void printSquares(int num) {
		IntStream.iterate(1, MainClass::squareNumber).limit(num).forEach(System.out::println);
	}

	public static int squareNumber(int x) {
		return (int) Math.pow((int) Math.sqrt(x) + 1, 2);
	}

	public static void main(String[] args) {
		printSquares(4);
	}

}
