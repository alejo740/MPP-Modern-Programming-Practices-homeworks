package edu.mum.cs.cs401.labs.lab10.problem1;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {

	public static final Function<List<String>, List<String>> lastLettersToUpperCase = words -> words.stream()
			.map(LambdaLibrary::changeLastLetterToUpperCase).collect(Collectors.toList());

	public static String changeLastLetterToUpperCase(String word) {
		StringBuffer stringBuffer = new StringBuffer(word);
		char lastChar = Character.toUpperCase(stringBuffer.charAt(stringBuffer.length() - 1));

		stringBuffer.setCharAt(stringBuffer.length() - 1, lastChar);
		return stringBuffer.toString();
	}
}
