package p11;

public class Start {

	public static void main(String[] args) {
		Mobile m = new Mobile("");
		
		m.setTelNo("090-1234-5678");
		m.setMaker("canon");
		
		m.talk();
		m.takePicture();
	}
}
