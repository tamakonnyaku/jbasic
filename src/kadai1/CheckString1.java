package kadai1;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("パスワード：");
		String ps = scan.next();
		if (ps.equals("himitu")) {
			System.out.println("一致しました");
		} else {
			System.out.println("一致しませんでした");
		}
	}

}
