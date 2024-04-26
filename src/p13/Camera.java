package p13;

public class Camera {
	//フィールド（メンバ変数）の定義
	protected String maker; //名前

	public Camera(String a) {
		
	}
	
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	//メソッドの定義
	void takePicture() {
		System.out.println("メーカー：" + maker);
		System.out.println("写真撮影中です");
	}

}
