package kadai2add;

import java.util.Scanner;

public class CheckString1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("1つ目の文字列を入力してください：");
		String moji1 = scan.next();	
		System.out.print("2つ目の文字列を入力してください：");
		String moji2 = scan.next();	
		if(moji1.length() == moji2.length()) {
			System.out.println("2つの文字列は同じです");
		}else {
			System.out.println("2つの文字列は異なります");
		}
	}
}
