package kadai5;

public class ItemAction1 {

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
	}

}
