package kadai7;

public class ItemAction2 {

	public static void main(String[] args) {
		// Itemクラスの配列を生成しItemとBookのオブジェクトを複数格納する
		Item[] itemlist = {new Item("ロボット掃除機",50000),
							new Book("鬼滅の包丁",500,"GO峠"),
							new Book("1ピース",500,"小田")};
		// 繰り返し処理を利用して1件ずつ商品情報を出力する
		for(Item data:itemlist) {
			data.showInfo();
			System.out.println("---");
		}
	}

}
