package p01;

public class Sample23 {
	
	//配列の宣言
	//データ型[] 配列名
	
	public static void main(String[] args) {
		String[][] canon = {{"田中","遠藤","椿"},{"薄井","菊水","木村"}};
		
		
		//領域の確保（何部屋用意するか）
		//配列名 = new データ型[部屋の数]
		
		//canon = new String[3];
		
		/*canon[0] = "田中";
		canon[1] = "遠藤";
		canon[2] = "椿";*/
		
		System.out.println(canon[0][0]);
		System.out.println(canon[0][1]);
		System.out.println(canon[0][2]);
		System.out.println(canon[1][0]);
		System.out.println(canon[1][1]);
		System.out.println(canon[1][2]);
		
	}

}
