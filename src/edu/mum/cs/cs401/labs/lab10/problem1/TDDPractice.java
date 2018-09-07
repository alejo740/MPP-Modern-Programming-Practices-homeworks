package edu.mum.cs.cs401.labs.lab10.problem1;

import java.util.Arrays;
import java.util.List;

public class TDDPractice {

	private List<String> changeLastCharToUpper(List<String> words) {
		return LambdaLibrary.lastLettersToUpperCase.apply(words);
	}

	public static void main(String[] args) {
		List<String> input = Arrays.asList("Edwin", "Eli", "Payman");
		List<String> result = LambdaLibrary.lastLettersToUpperCase.apply(input);
		System.out.println(result);
	}
}
