package p01;

public class Sample17 {
	
	public static void main(String[] args) {
		//配列の宣言と領域の確保とデータの設定
		//データ型[] 配列名 = {データ１, データ２, ・・・};
		//データ型[] 配列名 = new データ型[]{データ１, データ２, ・・・};
		//String[] canon = {"田中", "遠藤", "椿"};
		String[] canon = new String[]{"田中", "遠藤", "椿"};
		
		//マンションの部屋に住人を住まわせる
//		canon[0] = "田中";
//		canon[1] = "遠藤";
//		canon[2] = "椿";
				
		System.out.println(canon[0]);
		System.out.println(canon[1]);
		System.out.println(canon[2]);
		System.out.println(canon.length); //要素数
	}

}
