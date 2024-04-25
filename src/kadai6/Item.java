package kadai6;

public class Item {
	// フィールド
		private String name;
		private int price;
		// コンストラクタ
		public Item(String name,int price) {
			this.name = name;
			this.price = price;
		}
		// ゲッターセッター
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
		// 情報出力用showInfoメソッド
		public void showInfo() {
			System.out.println("商品名：" + this.getName());
			System.out.println("価格：" + this.getPrice() + "円");
		}
}
