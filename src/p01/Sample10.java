package p01;

import java.util.Scanner;

public class Sample10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("名前を入力してください→");
		String name = scan.next();
		System.out.print("年齢を入力してください→");
		int age = scan.nextInt();

		System.out.println("名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");

	}

}
