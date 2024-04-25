package p01;

public class Sample11 {
	
	public static void main(String[] args) {
		int age = 23;
		
		if (20 <= age && age < 30) {
			System.out.println("２０代");
		} else if (30 <= age && age < 40) {
			System.out.println("３０代");
		} else if (40 <= age && age < 50) {
			System.out.println("４０代");
		} else {
			System.out.println("該当なし");
		}
		
	}

}
