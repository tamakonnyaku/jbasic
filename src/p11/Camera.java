package p11;

public class Camera {
	//フィールド（メンバ変数）の定義
	private String maker; //名前

	public Camera(String a) {
		System.out.println("Cameraコンストラクタ");
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
