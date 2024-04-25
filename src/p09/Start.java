package p09;

public class Start {
	public static void main(String[] args) {
		
		Human h1 = new Human("薄井謙汰",22);
		h1.introduce();
		
		Human h2 = new Human();

		h2.name ="薄井謙汰";
		h2.age = 22;
		

		h2.introduce();
	}
}
