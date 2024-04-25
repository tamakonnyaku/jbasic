package p01;

import java.util.Random;

public class Sample01 {

	public static void main(String[] args) {

		System.out.print("薄井謙汰");

		Random rand = new Random();
		int num = rand.nextInt(9) + 20;
		System.out.println(num + "歳です");
		
	}

}
