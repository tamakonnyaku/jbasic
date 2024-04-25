package kadai3;

public class Calculator {
	public static void main(String[] args) {
		int a = add(3, 7);
		System.out.println(a);
		int b = sub(3, 7);
		System.out.println(b);
		double c = avg(3, 7);
		System.out.println(c);
	}
	// 足し算メソッドを作りなさい
	public static int add(int x,int y) {
		int add = x + y;
		return add;
	}
	// 引き算メソッドを作りなさい
	public static int sub(int x,int y) {
		int sub = x - y;
		return sub;
	}
	// 平均値メソッドを作りなさい
	public static double avg(int x,int y) {
		double avg = add(x,y) / 2;
		return avg;
	}
}
