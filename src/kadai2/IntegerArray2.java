package kadai2;

public class IntegerArray2 {

	public static void main(String[] args) {
		int[] numbers = {1,7,2,7,3};
		int count = 0;
		for(int data:numbers) {
			if (data == 7) {
				count++;
			}
		}
		System.out.println(count + "個ありました");
	}

}
