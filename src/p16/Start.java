package p16;

public class Start {

	public static void main(String[] args) {
		Oya o1 = new Oya();
		Kodomo k1 = new Kodomo(); 
		
		Oya o2 = new Kodomo();
		//Kodomo k2 = new Oya();
		//Kodomo k3 = o1;
		//Kodomo k4 = (Kodomo)o1;
		Kodomo k5 = (Kodomo)o2;
	}
}
