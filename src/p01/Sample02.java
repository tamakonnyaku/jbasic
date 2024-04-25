package p01;

import java.util.Random;

public class Sample02 {

	public static void main(String[] args) {
		
		int age = 22;
		String name = "薄井謙汰";
		//char c = 0b0100_0001;
		//char c = 0x41;
		char c = 'あ';
		
		System.out.println("名前:" + name);

		Random rand = new Random();
		int num = rand.nextInt(9) + 20;
		System.out.println("年齢:" + age + "歳です");
		System.out.println(c);
		
	}

}
