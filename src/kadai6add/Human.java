package kadai6add;

public class Human {
	private String name;

	public Human(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	// 情報出力用showInfoメソッド
	public void showInfo() {
		System.out.println("名前：" + this.getName());
	}
	
	public void attack() {
		System.out.println("攻撃した");
	}
}
