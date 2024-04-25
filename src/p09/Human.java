package p09;

public class Human {
	String name;
	int age;
	
	Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	Human() {
		super();
	}

	void introduce() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}
	void walk() {
		System.out.println("散歩中です");
	}
	void eat() {
		System.out.println("食事中です");
	}
}
