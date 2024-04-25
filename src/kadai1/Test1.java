package kadai1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("国語の点数を入力してください：");
		int kokugo = scan.nextInt();
		System.out.print("数学の点数を入力してください：");
		int suugaku = scan.nextInt();
		System.out.print("英語の点数を入力してください：");
		int eigo = scan.nextInt();

		double ave = (double)(kokugo + suugaku + eigo) / 3;
		System.out.println("平均は" + ave + "点です");
	}

}
