package p02;

public class Start {
	public static void main(String[] args) {
		//Humanクラスを操作するリモコン（参照変数）の宣言
		//クラス名　参照変数名;
		//Human h;
		
		//Humanクラスを元にインスタンスを生成して
		//リモコンで操作ができる状態にする
		//参照変数名 = new クラス名();
		//h = new Human();
		
		Human h = new Human();
		h.eat();
		h.introduce();
		h.walk();
		h.name = "薄井謙汰";
		h.age = 22;
		h.introduce();
	}
}
