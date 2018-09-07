package edu.mum.cs.cs401.labs.lab10.problem1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestTDDPractice {

	@Test
	public void multipleWordsChangeLastCharToUpperCase() {
		List<String> input = Arrays.asList("Edwin", "Eli", "Payman");
		List<String> result = LambdaLibrary.lastLettersToUpperCase.apply(input);
		assertEquals(Arrays.asList("EdwiN", "ElI", "PaymaN"), result);
	}
	
}
