package p01;

public class Sample29 {

	public static void main(String[] args) {
		int a = 10;
		kudo(a);
		
		double result = oku();
		System.out.println(result);
	}

	//メソッドの定義

	static void kudo(long x) {
		System.out.println(x);
	}
	static double oku() {
		return 10;
	}

}
