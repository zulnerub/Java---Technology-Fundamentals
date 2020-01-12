import java.util.Scanner;
import java.text.DecimalFormat;;
public class mathOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = Double.parseDouble(scanner.nextLine());
		String operator = scanner.nextLine();
		double b = Double.parseDouble(scanner.nextLine());
		
		switch (operator) {
		case "/":
			System.out.println(new DecimalFormat("#").format(divide(a, b)));
			break;
		case "*":
			System.out.println(new DecimalFormat("#").format(multiply(a, b)));
			break;
		case "+":
			System.out.println(new DecimalFormat("#").format(add(a, b)));
			break;
		case "-":
			System.out.println(new DecimalFormat("#").format(subtract(a, b)));
			break;
		}
		
	}
	static double divide(double a, double b) {
		
		return a / b;
	}
	
	static double multiply(double a, double b) {
		
		return a * b;
	}

	static double add(double a, double b) {
	
		return a + b;
	}

	static double subtract(double a, double b) {
	
		return a - b;
	}

}
