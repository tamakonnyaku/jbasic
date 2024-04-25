package kadai6;

public class BookAction1 {

	public static void main(String[] args) {
		// Bookクラスのオブジェクトを生成し変数b1に代入
		Book b1 = new Book("走れメロス",450,"太宰治");
		// 書籍情報を出力
		b1.showInfo();
		System.out.println("---");
		// ■Step4の処理
		// Bookクラスのオブジェクトを生成しItemクラスの変数i1に代入
		Item i1 = new Book("シャーロックホームズ",600,"コナン・ドイル");
		// 商品情報を出力
		i1.showInfo();
	}

}
