package kadai2;

public class IntegerArray3 {

	public static void main(String[] args) {
		int[] numbers = {1,7,2,7,3};
		int sum = 0;
		for(int data:numbers) {
			sum += data;
		}
		System.out.println("合計：" + sum);
	}

}
