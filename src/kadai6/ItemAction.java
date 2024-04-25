package kadai6;

public class ItemAction {

	public static void main(String[] args) {
		// Itemオブジェクト（ロボット掃除機/50000円）を生成
		Item item1 = new Item("ロボット掃除機",50000);
		// 商品情報を出力
		item1.showInfo();
		System.out.println("---");
		// Itemオブジェクト（洗濯機/200000円）を生成
		Item item2 = new Item("洗濯機",200000);
		// 商品情報を出力
		item2.showInfo();

	}

}
