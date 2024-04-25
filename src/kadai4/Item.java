package kadai4;

public class Item {

	protected String name;
	protected int price;
	
	public Item(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "名前：" + this.name + "、価格：" + price + "円";
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("名前：" + this.getName());
		System.out.println("価格(税抜き)：" + this.getPrice() + "円");
		System.out.println("価格(税込み)：" + (this.getPrice()+this.getPrice()/10) + "円");
	}
}
