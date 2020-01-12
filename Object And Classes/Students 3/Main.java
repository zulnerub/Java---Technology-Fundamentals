import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		List<Student> students = new ArrayList<>();
		
		
		for (int i = 0; i < n; i++) {
			String[] data = sc.nextLine().split("\\s+");
			
			Student graduate = new Student(data[0], data[1], Double.parseDouble(data[2]));
			students.add(graduate);
		}
		
		students
			.stream()
			.sorted((g2, g1) -> Double.compare(g1.getGrade(), g2.getGrade()))
			.forEach(e -> {
				System.out.println(e.toString());
				});
		
	}

}
