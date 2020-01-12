import java.util.Scanner;
public class elevator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int p = Integer.parseInt(scanner.nextLine());
		int n = Integer.parseInt(scanner.nextLine());
		
		int courses = (int) Math.ceil((double) p / n);
		System.out.println(courses);
	}

}
