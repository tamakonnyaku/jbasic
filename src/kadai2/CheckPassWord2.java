package kadai2;

import java.util.Scanner;

public class CheckPassWord2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("パスワードを入力してください：");
		String ps = scan.next();
		while(!(ps.equals("himitu"))) {
			if (ps.equals("himitu")) {
				break;
			} else {
				System.out.println("再入力してください：");
				ps = scan.next();
			}
		}
		System.out.println("ログインできました");
	}

}
