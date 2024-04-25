package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(900)+100;
		String num1 = String.valueOf(num);
		while(num1.charAt(0) == num1.charAt(1) ||
			num1.charAt(0) == num1.charAt(2) ||
			num1.charAt(1) == num1.charAt(2) ) {
			num = rand.nextInt(900)+100;
			num1 = String.valueOf(num);
		}

		Scanner scan = new Scanner(System.in);
		System.out.print("3桁の数字を入力してください：");
		String suji = scan.next();
		
		while(suji.charAt(0) == suji.charAt(1) ||
				suji.charAt(0) == suji.charAt(2) ||
				suji.charAt(1) == suji.charAt(2) ) {
			System.out.println("3桁の異なる数字を入力してください：");
			suji = scan.next();
		}
			
		
		int count = 1;
		int counthit = 0;
		int countbro = 0;
		
		while(!(num1.equals(suji))) {
			
			for(int i = 0; i < 3; i++) {
				if(num1.charAt(i) == suji.charAt(i)) {
					counthit++;
					continue;
				}
				for(int j = 0; j < 3; j++)
					
				if(num1.charAt(j) == suji.charAt(i)) {
					countbro++;
				}
			}
			System.out.println(counthit + "ヒット・" + countbro + "ブロー");
			counthit = 0; countbro = 0;
			System.out.print("3桁の数字を入力してください：");
			suji = scan.next();
			while(suji.charAt(0) == suji.charAt(1) ||
					suji.charAt(0) == suji.charAt(2) ||
					suji.charAt(1) == suji.charAt(2) ) {
				System.out.println("3桁の異なる数字を入力してください：");
				suji = scan.next();
			}
			count++;
		}
		System.out.println("3ヒット・0ブロー");
		System.out.println(count + "回で当たりました！");
	}

}
