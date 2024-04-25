package kadai6add;

public class Warrior extends Human {
	String rase;

	public Warrior(String name, String rase) {
		super(name);
		this.rase = rase;
	}
	
	public String getRase() {
		return this.rase;
	}

	public void setRase(String rase) {
		this.rase = rase;
	}

	// 情報出力用showInfoメソッド
	public void showInfo() {
		System.out.println("種別：" + this.getRase() + "　名前：" + this.getName());
	}
	
	public void attack() {
		System.out.println("「" + this.getRase() + "」は攻撃した");
	}
}
