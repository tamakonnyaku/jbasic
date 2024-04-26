package p10;

public class Start {

	public static void main(String[] args) {
		Human[] canon = {
				new Human("斎藤", 23),
				new Human("本間", 24),
				new Human("深沢", 25)
		};
		
//		canon[0] = new Human("斎藤", 23);
//		canon[1] = new Human("本間", 24);
//		canon[2] = new Human("深沢", 25);
		
		for (Human c : canon) {
			c.introduce();
		}
		
//		Human[] canon = new Human[3];
//		
//		canon[0] = new Human("斎藤", 23);
//		canon[1] = new Human("本間", 24);
//		canon[2] = new Human("深沢", 25);
//		
//		for (Human c : canon) {
//			c.introduce();
//		}
		
//		canon[0].introduce();
//		canon[1].introduce();
//		canon[2].introduce();
		
//		Human h1 = new Human("斎藤", 23);
//		Human h2 = new Human("本間", 24);
//		Human h3 = new Human("深沢", 25);
//		
//		h1.introduce();
//		h2.introduce();
//		h3.introduce();
		
		
//		String[] list = {"AAA", "BBB", "CCC"};
//		
//		for (String data : list) {
//			System.out.println(data);
//		}

//		String[] list = new String[3];
//		
//		list[0] = "AAA";
//		list[1] = "BBB";
//		list[2] = "CCC";
//		
//		for (String data : list) {
//			System.out.println(data);
//		}
		

//		int[] list = {10, 20, 30};
//		
//		for (int data : list) {
//			System.out.println(data);
//		}
		
//		int[] list = new int[3];
//		
//		list[0] = 10;
//		list[1] = 20;
//		list[2] = 30;
//		
//		for (int data : list) {
//			System.out.println(data);
//		}
//		
		
//		Human h1 = new Human("山田太郎", 23);
//		h1.introduce();
//		
//		Human h2 = new Human();
//		
//		h2.name = "山田太郎";
//		h2.age = 23;
//		
//		h2.introduce();
	}

}
