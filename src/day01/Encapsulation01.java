package day01;

public class Encapsulation01 {

	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public static void main(String[] args) {
		Encapsulation01 enc = new Encapsulation01();
		enc.name = "Pranav";
		enc.id = 464;
		
		System.out.println(enc.getName());
		System.out.println(enc.getId());
	}
}
