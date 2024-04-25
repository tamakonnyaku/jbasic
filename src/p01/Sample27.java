package p01;

public class Sample27 {

	public static void main(String[] args) {
		oku();
		kudo(10, 20);
		int result = endo(100,200);
		System.out.println(result);
		System.out.println(endo(1,2));
	}

	//メソッドの定義
	static void oku() {
		System.out.println("よろしく！");
	}

	static void kudo(int x, int y) {

		System.out.println(x + y);
	}

	static int endo(int x, int y) {

		return x+y;
	}

}
