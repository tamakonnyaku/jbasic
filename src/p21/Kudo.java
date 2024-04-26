package p21;

public class Kudo implements Canon{

	@Override
	public void work() {
		System.out.println(Canon.COMPANY);
		System.out.println("経理です");
	}

	@Override
	public void salary() {
		
		System.out.println("28万円です");
	}

}
