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
			
			if (IsStudentExisting(students, data[0], data[1])) {
				Students student = getStudent(students, data[0], data[1]);
				
				student.setFirstName(data[0]);
				student.setLastName(data[1]);
				student.setAge(Integer.parseInt(data[2]));
				student.setHomeTown(data[3]);
				
				
				
			}else {
				Students student = new Students(data[0], data[1], Integer.parseInt(data[2]), data[3]);
				students.add(student);
			}
			
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

	private static Students getStudent(List<Students> students, String firstName, String lastName) {
		Students existingStudent = null;
		for (Students student : students) {
			if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
				existingStudent = student;
			}
		}
		
		return existingStudent;
	}

	private static boolean IsStudentExisting(List<Students> students, String firstName, String lastName) {
		for (Students student : students) {
			if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
				return true;
			}
		}
		
		return false;
	}

}
