package kadai4;

public class User {
	// フィールド（名前と年齢）
	String name;
	int age;
	
	public User(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	// 情報を出力するshowInfo()メソッド
	public void showInfo() {
		System.out.println("名前：" + this.getName());
		System.out.println("年齢：" + this.getAge());
	}
}
