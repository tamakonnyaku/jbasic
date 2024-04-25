package kadai2;
import java.util.Scanner;
public class Introduce2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("情報を登録します");
		System.out.print("名前：");
		String name = scan.next();
		System.out.print("趣味1：");
		String s1 = scan.next();
		System.out.print("趣味2：");
		String s2 = scan.next();
		System.out.print("趣味3：");
		String s3 = scan.next();
		String[] hobbyList = {s1,s2,s3};
		
		System.out.println("---");
		
		System.out.println("こんにちは" + name + "です");
		System.out.println("私の趣味は、");
		for(String data:hobbyList) {
			System.out.println("・" + data);
		}
		System.out.println("です");
	}

}
