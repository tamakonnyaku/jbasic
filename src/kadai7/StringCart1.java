package kadai7;

public class StringCart1 {

	public static void main(String[] args) {
		// 文字列を保持できるリストの作成
		String[] list = new String[3];
		// 「ロボット掃除機」の追加
		list[0] = "ロボット掃除機";
		// 「ドラム式洗濯機」の追加
		list[1] = "ドラム式洗濯機";
		// 「液晶テレビ」の追加
		list[2] = "液晶テレビ";
		// 拡張for文を利用して全商品を出力する
		for(String data : list) {
			System.out.println(data);
		}

	}

}
