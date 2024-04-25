package kadai6add;

import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		Human[] party = new Human[3];
		Scanner scan = new Scanner(System.in);
		// パーティ作成
		System.out.println("===パーティを作成します===");
		for (int i = 0; i < party.length; i++) {
			System.out.println("どちら（1:市民　2:戦士）を作成しますか：");
			int selct = scan.nextInt();

			if (selct == 1) {
				System.out.print("名前：");
				String name = scan.next(); // 名前の入力
				party[i] = new Human(name);
			} else if (selct == 2) {
				System.out.print("名前：");
				String name = scan.next(); // 名前の入力
				System.out.print("種別：");
				String rase = scan.next(); // 種別の入力
				party[i] = new Warrior(name, rase);
			} else {
				System.out.print("1,2のどちらかを選択してください");
			}

		}
		System.out.println("===パーティを作成しました===\n\n");
		do {
			System.out.println("操作（1:一覧表示 2:攻撃 9:終了）を選択してください：");
			int selct = scan.nextInt();
			if (selct == 1) {
				for (Human data : party) {
					data.showInfo();
				}
			} else if (selct == 2) {
				for (Human data : party) {
					data.attack();
				}
			} else if (selct == 9) {
				break;
			} else {
				System.out.println("1,2,9のどれかを選択してください");
			}
			System.out.println();
		} while (true);
		scan.close();

	}

}
