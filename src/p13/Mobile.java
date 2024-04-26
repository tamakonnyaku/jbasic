package p13;

public class Mobile extends Camera{
	private String telNo;
	
	
	public Mobile(String telNo,String maker) {
		super(maker);
		this.telNo = telNo;
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
