package kadai3;

import java.util.Scanner;

public class CalcPoints2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("購入金額：");
		int price = scan.nextInt();
		System.out.println("1:プレミア会員, 2:無料会員");
		System.out.print("会員ランク：");
		int rank = scan.nextInt();
		// 会員ランクによる判定
		if(rank == 1) {
			System.out.println("プレミア会員には" + getPoints(price,true) + "ポイント付与されます");
		}else {
			System.out.println("無料会員には" + getPoints(price,false) + "ポイント付与されます");
		}
		scan.close();
	}
	// ポイント計算メソッド
	public static int getPoints(int price, boolean x) {
		int point = 0;
		if(x == true) {
			point = price/100*20;
		}else {
			point = price/100*10;
		}
		return point;
	}
}
