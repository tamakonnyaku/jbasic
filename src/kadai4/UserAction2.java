package kadai4;

import java.util.Scanner;

public class UserAction2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 田中太郎（20）の情報を登録して出力
		
		System.out.println("会員登録をします");
		System.out.print("名前：");
		String name1 = scan.next();
		System.out.print("年齢：");
		int age1 = scan.nextInt();
		User user1 = new User(name1,age1);
		
		System.out.println("---");
		System.out.println("会員を登録しました");
		user1.showInfo();
	}

}
