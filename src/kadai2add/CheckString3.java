package kadai2add;

import java.util.Scanner;

public class CheckString3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("繰り返す回数を入力してください：");
		int kaisu = scan.nextInt();
		String[] youso = new String[kaisu];
		String sd ="";
		
		for(int i = 0; i < kaisu; i++) {
			System.out.print((i+1) + "つ目の文字列を入力してください：");
			String moji = scan.next();	
			youso[i] = moji;
		}
		for(String data:youso) {
			if(sd.length() < data.length()) {
				sd = data;
			}
		}
		System.out.println("最も長い文字列は「" + sd + "」です");
	}
}
