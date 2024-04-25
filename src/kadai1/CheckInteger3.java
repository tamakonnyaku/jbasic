package kadai1;

import java.util.Scanner;

public class CheckInteger3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("数字を入力してください：");
		int suji = scan.nextInt();
		
		if(suji == 0) {
			System.out.println(suji + "は正の数でも負の数でもない偶数です");
		}else if(suji > 0 && suji%2 == 0) {
			System.out.println(suji + "は正の偶数です");
		}else if(suji > 0 && suji%2 == 1){
			System.out.println(suji + "は正の奇数です");
		}else if(suji < 0 && suji%2 == 0){
			System.out.println(suji + "は負の偶数です");
		}else {
			System.out.println(suji + "は負の奇数です");
		}

	}

}
