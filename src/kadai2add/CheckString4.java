package kadai2add;

import java.util.Scanner;

public class CheckString4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("繰り返す回数を入力してください：");
		int kaisu = scan.nextInt();
		String goukei = "";
		for(int i = 1; i <= kaisu; i++) {
			System.out.print(i + "つ目の文字列を入力してください：");
			String moji = scan.next();	
			goukei += moji;
			System.out.println(goukei);
		}
	}
}
