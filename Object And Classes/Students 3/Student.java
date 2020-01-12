public class Student {
	private String firstName;
	private String lastName;
	private double grade;
	
	
	public Student (String firstName, String lastName, double grade) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setGrade(grade);
	}

	public String toString() {
		return String.format("%s %s: %.2f", 
				this.getFirstName(),
				this.getLastName(),
				this.getGrade()
				);
	}

	public String getFirstName() {
		return this.firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return this.lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getGrade() {
		return this.grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}

}
