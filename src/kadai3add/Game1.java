package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(100);

		Scanner scan = new Scanner(System.in);
		System.out.print("数字を入力してください：");
		int suji = scan.nextInt();
		
		int count = 1;
		
		while(!(num == suji)) {
			if(num > suji) {
				System.out.println("**小さすぎです**");
			}else {
				System.out.println("**大きすぎです**");
			}
			System.out.print("数字を入力してください：");
			suji = scan.nextInt();
			count++;
		}
		System.out.println("**当たりです**");
		System.out.println(count + "回で当たりました！");
	}

}
