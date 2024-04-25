package kadai4add;

public class Customer {
	int id;
	String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setData(String name) {
		this.name = name;
	}
	
	public void setData(int id,String name) {
		this.name = name;
		this.id = id;
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
