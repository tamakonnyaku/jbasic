package kadai5add;

public class Customer {
	private String name;
	private int id;
	
	public Customer(int id,String name) {
		this.name = name;
		this.id = id;
	}
	public Customer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void showData() {
		System.out.println(this.getId() + "：" + this.getName());
	}

}
