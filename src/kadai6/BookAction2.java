package kadai6;

public class BookAction2 {

	public static void main(String[] args) {
		// Itemクラスの配列を生成しItemとBookのオブジェクトを複数格納する
		Item[] itemlist = {new Item("ロボット掃除機",50000),
							new Book("鬼滅の包丁",450,"GO峠こよはる"),
							new Book("1ピース",500,"尾田A一郎")};
		// 繰り返し処理を利用して1件ずつ商品情報を出力する
		for(Item data:itemlist) {
			data.showInfo();
			System.out.println("---");
		}
	}

}
