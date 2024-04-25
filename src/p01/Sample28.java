package p01;

public class Sample28 {

	public static void main(String[] args) {
		int[] list = {10,20,30};
		
		kudo(list);
		int[] ary = endo();
		for(int data:ary) {
			System.out.println(data);
		}
	}

	//メソッドの定義

	static void kudo(int[] list) {
		for(int data:list) {
			System.out.println(data);
		}
	}
	
	static int[] endo() {
		int[] ary = {100,200,300};
		return ary;
	}
}
