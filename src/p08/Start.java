package p08;

public class Start {
	public static void main(String[] args) {
		
		Human h1 = new Human();
		Human h2;

		h1.setName("薄井謙汰");
		h1.setAge(-2);
		
		h2 = h1;
		
		System.out.println("名前：" + h1.getName());
		System.out.println("年齢：" + h1.getAge());
		//h.introduce();
	}
}
