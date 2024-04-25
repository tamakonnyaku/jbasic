package kadai1;

import java.util.Random;

public class CheckRandom {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		if(num == 0) {
			System.out.println("グー");
		}else if(num == 1) {
			System.out.println("チョキ");
		}else{
			System.out.println("パー");
		}

	}

}
