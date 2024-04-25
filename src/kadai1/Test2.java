package kadai1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("国語の点数を入力してください：");
		int kokugo = scan.nextInt();
		System.out.print("数学の点数を入力してください：");
		int suugaku = scan.nextInt();
		System.out.print("英語の点数を入力してください：");
		int eigo = scan.nextInt();

		if(kokugo == suugaku && suugaku == eigo) {
			System.out.println("最高点は国語と数学と英語の" + kokugo + "点です");
		}else if(kokugo == suugaku && kokugo > eigo){
			System.out.println("最高点は国語と数学の" + kokugo + "点です");
		}else if(kokugo == eigo && kokugo > suugaku){
			System.out.println("最高点は国語と英語の" + kokugo + "点です");
		}else if(suugaku == eigo && kokugo < suugaku){
			System.out.println("最高点は数学と英語の" + suugaku + "点です");
		}else if(kokugo > eigo && kokugo > suugaku){
			System.out.println("最高点は国語の" + kokugo + "点です");
		}else if(suugaku > kokugo && suugaku > eigo){
			System.out.println("最高点は数学の" + suugaku + "点です");
		}else{
			System.out.println("最高点は英語の" + eigo + "点です");
		}
	}

}
