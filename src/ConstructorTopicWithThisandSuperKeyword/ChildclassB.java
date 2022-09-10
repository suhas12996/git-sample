package ConstructorTopicWithThisandSuperKeyword;

public class ChildclassB extends ParentClassA {

	public ChildclassB() {
		super();
	}

	public ChildclassB(int i) {
		super(i);
	}

	public ChildclassB(int i, int j) {
		super(i, j);
	}

	public static void main(String[] args) {
		ChildclassB b = new ChildclassB();
		ChildclassB b1 = new ChildclassB(10);
		ChildclassB b2 = new ChildclassB(10, 20);

	}

}
