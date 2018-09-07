package edu.mum.cs.cs401.labs.lab07.problem3;

public interface Cache {
	// shouldn't be static
	default long timeout() {
		// seconds
		return 1;
	}
}
