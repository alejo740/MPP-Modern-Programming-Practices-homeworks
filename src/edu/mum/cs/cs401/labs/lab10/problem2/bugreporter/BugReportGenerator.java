package edu.mum.cs.cs401.labs.lab10.problem2.bugreporter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import java.util.logging.Logger;
import java.util.stream.Collectors;

import edu.mum.cs.cs401.labs.lab10.problem2.classfinder.ClassFinder;

/**
 * import lesson10.labs.prob2.classfinder.ClassFinder; This class scans the
 * package lesson10.labs.prob2.javapackage for classes with
 * annotation @BugReport. It then generates a bug report bugreport.txt,
 * formatted like this:
 * 
 * Joe Smith reportedBy: classname: description: severity:
 * 
 * reportedBy: classname: description: severity:
 * 
 * Tom Jones reportedBy: classname: description: severity:
 * 
 * reportedBy: classname: description: severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "edu.mum.cs.cs401.labs.lab10.problem2.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";

	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		// implement

		/// USING PrintWriter
		/*
		 * PrintWriter pw = createFile(REPORT_NAME);
		 * writeReportToFileWithPrintWriter(classes, pw); pw.close();
		 */

		/// USING BufferedWriter
		Path path = Paths.get(REPORT_NAME);
		writeReportToFileWithBufferedWriter(classes, path);

		System.out.println("Report generated successfully!");
	}

	private void writeReportToFileWithBufferedWriter(List<Class<?>> classes, Path path) {
		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
			String previousAssigneTo = "";
			for (Class<?> classItem : classes) {
				BugReport report = (BugReport) classItem.getAnnotation(BugReport.class);

				if (!previousAssigneTo.equals(report.assignedTo())) {
					writer.write(report.assignedTo());
					writer.newLine();
					previousAssigneTo = report.assignedTo();
				}
				writer.write("\t" + REPORTED_BY + report.reportedBy());
				writer.newLine();
				writer.write("\t" + CLASS_NAME + classItem.getName());
				writer.newLine();
				writer.write("\t" + DESCRIPTION + report.description());
				writer.newLine();
				writer.write("\t" + SEVERITY + report.severity());
				writer.newLine();
				writer.newLine();
			}
		} catch (IOException e) {
			LOG.warning("IOException " + e.getMessage());
		}
	}
	
	private void writeReportToFileWithBufferedWriterFunctional(List<Class<?>> classes, Path path) {
		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
			String previousAssigneTo = "";
			classes.stream()
			.map(y -> y.getAnnotation(BugReport.class))
			.forEach(x -> {
				
				//previousAssigneTo = x.assignedTo();
				System.out.println(x.assignedTo());
				System.out.println("\t" + REPORTED_BY + x.reportedBy());
				//System.out.println("\t" + CLASS_NAME + y.getName());// problem
				System.out.println("\t" + DESCRIPTION + x.description());
				System.out.println("\t" + SEVERITY + x.severity());
				System.out.println("");
			});
		} catch (IOException e) {
			LOG.warning("IOException " + e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void writeReportToFileWithPrintWriter(List<Class<?>> classes, PrintWriter pw) {
		String previousAssigneTo = "";
		for (Class<?> classItem : classes) {
			BugReport report = (BugReport) classItem.getAnnotation(BugReport.class);

			if (!previousAssigneTo.equals(report.assignedTo())) {
				pw.println(report.assignedTo());
				previousAssigneTo = report.assignedTo();
			}
			pw.println("\t" + REPORTED_BY + report.reportedBy());
			pw.println("\t" + CLASS_NAME + classItem.getName());
			pw.println("\t" + DESCRIPTION + report.description());
			pw.println("\t" + SEVERITY + report.severity());
			pw.println("");
		}
	}

	private PrintWriter createFile(String fileName) {
		try {
			FileWriter fw = new FileWriter(fileName);
			PrintWriter pw = new PrintWriter(fw);
			return pw;
		} catch (IOException e) {
			LOG.warning("IOException " + e.getMessage());
		}
		return null;

	}
}
