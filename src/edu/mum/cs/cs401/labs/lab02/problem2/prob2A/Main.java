package edu.mum.cs.cs401.labs.lab02.problem2.prob2A;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("Edwin");
		
		GradeReport report = student.getGradeReport();
		
		Student studentInReport = report.getStudent();
		
		if(student.equals(studentInReport)) {
			System.out.println("The same student");
		}
	}

}
