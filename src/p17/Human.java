package p17;

public class Human {

	String name;
	int age;
	
	//public Human(String name, int age) {
	//	super();
	//	this.name = name;
	//	this.age = age;
	//}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {
		System.out.println("食べます");
	}

	
}
