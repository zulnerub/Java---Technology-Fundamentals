import java.util.Scanner;
public class printTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < input; i++) {
			triangle(1, i);
		
		}
		
		triangle(1, input);
		
		for (int i = input - 1; i >= 1; i--) {
			triangle(1, i);
		}
	}
	
	static void triangle(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	

}
