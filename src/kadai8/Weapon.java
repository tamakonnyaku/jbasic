package kadai8;

public class Weapon {

	private String name;
	private int offensivePower;
	
	public Weapon(String name,int offensivePower) {
		this.name = name;
		this.offensivePower = offensivePower;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getOffensivePower() {
		return this.offensivePower;
	}
	
	public void setOffensivePower(int offensivePower) {
		this.offensivePower = offensivePower;
	}
}
