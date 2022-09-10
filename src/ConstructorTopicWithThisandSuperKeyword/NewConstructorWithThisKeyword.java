package ConstructorTopicWithThisandSuperKeyword;

public class NewConstructorWithThisKeyword {

	int age;
	String name;

	public NewConstructorWithThisKeyword(String name, int age) { // new constructor
		this.name = name;
		this.age = age;

		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		NewConstructorWithThisKeyword td = new NewConstructorWithThisKeyword("suhas", 26);

	}

}
