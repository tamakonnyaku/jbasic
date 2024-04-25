package kadai5;

public class ItemAction2 {

	public static void main(String[] args) {
		// 商品オブジェクトを生成
		Item item1 = new Item("",0);
		// セッターを利用して情報（絵本/1000円）をセットする
		item1.setName("絵本");
		item1.setPrice(1000);
		// ゲッターを利用して商品の情報を出力する
		System.out.println("商品名：" + item1.getName());
		System.out.println("価格：" + item1.getPrice() + "円");
		
		System.out.println("---");
		
		Item item2 = new Item("シャンプー",222);
		item2.showInfo();
		
		// 3つの要素をもつ商品クラスの配列を生成
		Item[] items = {new Item("ロボット掃除機",50000),
						new Item("空気清浄機",20000),
						new Item("扇風機",4000)};
		for(Item data:items) {
			data.showInfo();
			System.out.println("---");
		}
	}

}
