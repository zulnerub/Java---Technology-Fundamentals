import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Students> students = new ArrayList<>();
		
		String input = sc.nextLine();
		
		while (!input.equals("end")) {
			String[] data = input.split(" ");
			
			Students student = new Students();
			
			student.setFirstName(data[0]);
			student.setLastName(data[1]);
			student.setAge(Integer.parseInt(data[2]));
			student.setHomeTown(data[3]);
			
			students.add(student);
			input = sc.nextLine();
		}
		
		String homeTown = sc.nextLine();
		
		for (Students student : students) {
			if (student.getHomeTown().equals(homeTown)) {
				System.out.printf("%s %s is %d years old%n", 
						student.getFirstName(),
						student.getLastName(),
						student.getAge());
			}
		}
	}

}
