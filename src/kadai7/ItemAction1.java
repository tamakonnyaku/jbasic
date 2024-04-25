package kadai7;

import java.util.Scanner;

public class ItemAction1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 文字列を保持できるリストの作成
		Item[] itemList = {new Item("ロボット掃除機",50000),
							new Item("ドラム式洗濯機",200000),
							new Item("液晶テレビ",100000)};
		for(Item data:itemList) {
			data.showInfo();
			System.out.println("---");
		}
	}
}
