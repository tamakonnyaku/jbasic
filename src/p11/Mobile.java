package p11;

public class Mobile extends Camera{
	private String telNo;
	
	
	public Mobile(String a) {
		super(a);
		System.out.println("Mobileコンストラクタ");
	}
	public void talk() {
		System.out.println("aowejoa");
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
}
