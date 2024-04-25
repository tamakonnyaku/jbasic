package kadai4add;

public class Convert {
	public static void reverse(int x) {
		String s = String.valueOf(x);

		String reverseString = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			reverseString = reverseString + s.charAt(i);
		}
		
		int a = Integer.parseInt(reverseString);
		System.out.println(a);
	}
	public static void reverse(double x) {
		String s = String.valueOf(x);

		String reverseString = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			reverseString = reverseString + s.charAt(i);
		}
		
		double a = Double.parseDouble(reverseString);
		System.out.println(a);
	}
	public static void reverse(String x) {

		String reverseString = "";

		for (int i = x.length() - 1; i >= 0; i--) {

			reverseString = reverseString + x.charAt(i);
		}
		
		System.out.println(reverseString);
	}
}
