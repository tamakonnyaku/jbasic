package kadai4add;

import java.util.Scanner;

public class UseConvert {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 入力した整数を反転させる
		System.out.print("整数を入力して下さい：");
		int input1 = scan.nextInt();
		Convert.reverse(input1);
		// 入力した浮動小数点数を反転させる
		System.out.print("浮動小数点数を入力して下さい：");
		double input2 = scan.nextDouble();
		Convert.reverse(input2);
		// 入力した文字列を反転させる
		System.out.print("文字列を入力して下さい：");
		String input3 = scan.next();
		Convert.reverse(input3);
		scan.close();

	}

}
