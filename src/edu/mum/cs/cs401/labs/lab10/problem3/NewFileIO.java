package edu.mum.cs.cs401.labs.lab10.problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewFileIO {

	public final static String FILE_LOCATION = "src/edu/mum/cs/cs401/labs/lab10/problem3/word_test.txt";

	public void readText(String filename) {
		Path path = Paths.get(filename);

		try (BufferedReader reader = Files.newBufferedReader(path)) {
			reader
			.lines()
			.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		NewFileIO newFileIO = new NewFileIO();

		newFileIO.readText(FILE_LOCATION);
	}
}
