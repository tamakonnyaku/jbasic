package kadai4;

public class ItemAction {

	public static void main(String[] args) {
		// Itemクラスのオブジェクトを生成し変数item1に代入する
		Item item1 = new Item("絵本",1000);
		Item item2 = new Item("シャンプー",222);
		// item1のフィールドに商品名「絵本」、価格「1000」を設定する
		
		// item1を利用して商品名と価格の情報を出力する
		System.out.println("名前：" + item1.getName());
		System.out.println("価格：" + item1.getPrice() + "円");
		
		System.out.println("---");
		
		item2.showInfo();

	}

}
