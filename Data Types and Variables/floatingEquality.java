import java.util.Scanner;
public class floatingPointEquality {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double num1 = Double.parseDouble(scanner.nextLine());
		double num2 = Double.parseDouble(scanner.nextLine());
		
		double arbitter = 0.000001;
		double diff = Double.max(num1, num2) - Double.min(num1, num2);
		
		if (diff < arbitter) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}
