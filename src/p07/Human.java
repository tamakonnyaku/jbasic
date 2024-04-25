package p07;

public class Human {
	private String name;
	private int age;
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
		if(!(0 <= age && age <= 130)) {
			return;
		}
		this.age = age;
	}

	//void introduce() {
	//	System.out.println("名前：" + name);
	//	System.out.println("年齢：" + age);
	//}
	
	//アクセッサ・メソッドの定義
	
}
