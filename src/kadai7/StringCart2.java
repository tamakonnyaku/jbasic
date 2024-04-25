package kadai7;

import java.util.Scanner;

public class StringCart2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 文字列を保持できるリストの作成
		String[] list = new String[3];
		
		for(int i = 0; i < list.length; i++) {
			System.out.print("商品を追加してください：");
			String s = scan.next();
			list[i] = s;
		}

		// 拡張for文を利用して全商品を出力する
		for(String data : list) {
			System.out.println(data);
		}

	}

}
