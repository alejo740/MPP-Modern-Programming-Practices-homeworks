package test;

public interface ClassB extends ClassX {

	default void methodA() {
		System.out.println("Default method A from classB");
	}
	
}
