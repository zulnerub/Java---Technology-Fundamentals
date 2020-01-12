import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double num = Double.parseDouble(scanner.nextLine());
		double power = Double.parseDouble(scanner.nextLine());
		
		System.out.println(new DecimalFormat("0.####").format(numPower(num, power)));
	}
	static double numPower(double num, double power) {
		double result = Math.pow(num, power);
		return result;
	}
}
