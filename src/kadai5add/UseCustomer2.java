package kadai5add;

import java.util.Scanner;

public class UseCustomer2 {
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

		do {
			System.out.println("操作（1:一覧表示 2:変更 9:終了）を選択してください：");
			int selct = scan.nextInt();
			if(selct == 1) {
				System.out.println("=== 顧客データ一覧 ===");
				for (Customer customer : customerList) {
					customer.showData();
				}
			}else if(selct == 2) {
				System.out.println("更新するID：");
				int id1 = scan.nextInt();
				int i = 0;
				for(Customer data:customerList) {
					i++;
					if(data.getId() == id1) {
						System.out.println("新しいID：");
						int id2 = scan.nextInt();
						System.out.println("新しい名前：");
						String name = scan.next();
						data.setId(id2);
						data.setName(name);
					}else if(i == customerList.length) {
						System.out.println("指定したIDは存在しません。");
					}
				}
			}else if(selct == 9) {
				break;
			}else {
				System.out.println("1,2,9のどれかを選択してください");
			}
			System.out.println();
		} while (true);
		scan.close();
	}
}
