package p05;

public class Human {

	void eat(int money) {
		System.out.println(money + "円もらったよ！");
		System.out.println("叙々苑で食べる");

	}
	
	void eat(String bento) {
		System.out.println(bento + "もらったよ！");
		System.out.println("その弁当を食べる");

	}
	
	void eat() {
		System.out.println("自腹で食べる");
	}
}
