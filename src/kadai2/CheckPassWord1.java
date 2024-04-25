package kadai2;

import java.util.Scanner;

public class CheckPassWord1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for(int i = 0; i < 3; i++) {
			System.out.print("パスワードを入力してください：");
			String ps = scan.next();
			if (ps.equals("himitu")) {
				System.out.println("ログインできました");
				i =3;
			} else {
				System.out.println("不正解です");
			}
		}
	}

}
