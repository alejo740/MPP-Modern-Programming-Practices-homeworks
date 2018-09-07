package test;

public class Main {

	private String attribute1 = "Class Attribute";

	private void methodA(String param1) {
		final class methodAInnerClass {
			public void innerMethod(String myParam) {
				System.out.println("This is a test for " + myParam);
				System.out.println("This is a test for " + param1);
				System.out.println("This is a test for " + attribute1);
			}
		}

		new methodAInnerClass().innerMethod("InnerParam");
	}

	public static void main(String[] args) {
		(new Main()).methodA("Params method");
	}

}
