package p01;

public class Sample16 {
	
	public static void main(String[] args) {
		//配列の宣言
		//データ型[] 配列名;
		//String[] canon;
		
		//領域の確保（何部屋用意するか）
		//配列名 = new データ型[部屋の数];
		//canon = new String[3];
		
		//配列の宣言と領域の確保
		//データ型[] 配列名 = new データ型[部屋の数];
		String[] canon = new String[3];
		
		//マンションの部屋に住人を住まわせる
		canon[0] = "田中";
		canon[1] = "遠藤";
		canon[2] = "椿";
				
		System.out.println(canon[0]);
		System.out.println(canon[1]);
		System.out.println(canon[2]);
		System.out.println(canon.length); //要素数
	}

}
