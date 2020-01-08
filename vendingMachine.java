package Exercise_01;
import java.util.Scanner;
public class vending {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		double sum = 0;
		int count = 100;
		double coin;
		
		while (!input.equals("Start")) {
			coin = Double.parseDouble(input);
			if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
				sum += coin;
			}else {
				System.out.printf("Cannot accept %.2f", coin);
			}
			input = scanner.nextLine();
		}
		
		input = scanner.nextLine();
		
		
		while (!input.equals("End")) {
			switch (input.toLowerCase()) {
			case "nuts":
				if (sum >= 2.0) {
					sum -= 2.0;
					System.out.println("Purchased Nuts");
				}else {
					System.out.println("Sorry, not enough money");
				}
				break;
			case "water":
				if (sum >= 0.7) {
					sum -= 0.7;
					System.out.println("Purchased Water");
				}else {
					System.out.println("Sorry, not enough money");
				}
				break;
			case "crisps":
				if (sum >= 1.5) {
					sum -= 1.5;
					System.out.println("Purchased Crisps");
				}else {
					System.out.println("Sorry, not enough money");
				}
				break;
			case "soda":
				if (sum >= 0.8) {
					sum -= 0.8;
					System.out.println("Purchased Soda");
				}else {
					System.out.println("Sorry, not enough money");
				}
				break;
			case "coke":
				if (sum >= 1.0) {
					sum -= 1.0;
					System.out.println("Purchased Coke");
				}else {
					System.out.println("Sorry, not enough money");
				}
				break;
				default :
					System.out.println("Invalid product");
					break;
			}
			input = scanner.nextLine();
		}
		System.out.printf("Change: %.2f", sum);
	}

}
