import java.util.Scanner;
public class passed {
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			double a = Double.parseDouble(scanner.nextLine());
			
			if (a >= 3.00) {
				System.out.println("Passed!");
			}else if (a < 3){
				System.out.println("Failed!");
			}
			
		}

}
