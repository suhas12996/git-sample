package ConstructorTopicWithThisandSuperKeyword;

public class ParentClassA {

	public ParentClassA() {
	System.out.println("Default Constructor");
	}
	
	public ParentClassA(int i) {
		System.out.println("one parameter constructor"+i);
	}
	public ParentClassA(int i,int j) {
		System.out.println("two parameter constructor"+i);
		System.out.println("one parameter constructor"+j);
	}
}
