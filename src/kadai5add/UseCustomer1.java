package kadai5add;

import java.util.Scanner;

public class UseCustomer1 {
	public static void main(String[] args) {
		Customer[] customerList = new Customer[3];
		Scanner scan = new Scanner(System.in);
		// 顧客データの読み込み
		for (int index = 0; index < customerList.length; index++) {
			System.out.println((index + 1)
					+ "人目の顧客情報を入力してください。");
			System.out.print("ID：");
			int id = scan.nextInt(); // IDの入力
			System.out.print("名前：");
			String name = scan.next(); // 名前の入力
			Customer customer;
			if (id == -1) {
				// IDが-1なら名前だけ登録
				customer = new Customer(name);
			} else {
				// IDが-1でなければIDと名前を登録
				customer = new Customer(id, name);
			}
			customerList[index] = customer;
		}
		// 顧客データ表示
		System.out.println();
		System.out.println("=== 顧客データ一覧 ===");
		for (Customer customer : customerList) {
			customer.showData();
		}
		scan.close();
	}
}
