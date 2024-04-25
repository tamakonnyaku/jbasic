package kadai7add;

public class Book extends Item {
	private String author;

	public Book(String name, int price, String author) {
		super(name, price);
		this.author = author;
	}

	// ゲッターセッター
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// 情報出力用showInfoメソッド
	public void showInfo() {
		super.showInfo();
		//System.out.println("商品名：" + this.getName());
		//System.out.println("価格：" + this.getPrice() + "円");
		System.out.println("著者：" + this.getAuthor());
	}
	
	public String getInfo() {
		return this.getName() + "(著:" + this.getAuthor() + ")/" + this.getPrice() + "円";
	}

}
