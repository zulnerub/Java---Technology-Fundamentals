
public class Members {
	private String name;
	private int id;
	private int age;
	
	public Members(String name, int id, int age) {
		this.setName(name);
		this.setId(id);
		this.setAge(age);
	}
	
	public String toString() {
		return String.format("%s with ID: %d is %d years old.", 
				this.getName(),
				this.getId(),
				this.getAge()
				);
	}
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
