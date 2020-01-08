package Exercise_01;
import java.util.Scanner;
public class vacation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int people = Integer.parseInt(scanner.nextLine());
		String groupType = scanner.nextLine();
		String day = scanner.nextLine();
		
		double sum = 0;
		
		switch (day) {
		case "Friday":
			switch (groupType) {
			case "Students":
				if (people >= 30) {
					sum = (people * 8.45) * 0.85;
					System.out.printf("Total price: %.2f", sum);
				}else {
					sum = people * 8.45;
					System.out.printf("Total price: %.2f", sum);
				}
				break;
			case "Business":
				if (people >= 100) {
					sum = (people * 10.90) - 109;
					System.out.printf("Total price: %.2f", sum);
				}else {
					sum = people * 10.90;
					System.out.printf("Total price: %.2f", sum);
				}
				break;
			case "Regular":
				if (people >= 10 && people < 21) {
					sum = (people * 15) * 0.95;
					System.out.printf("Total price: %.2f", sum);
				}else {
					sum = people * 15;
					System.out.printf("Total price: %.2f", sum);
				}
				break;
			}
			
			break;
			
		case "Saturday":
			switch (groupType) {
			case "Students":
				if (people >= 30) {
					sum = (people * 9.80) * 0.85;
					System.out.printf("Total price: %.2f", sum);
				}else {
					sum = people * 9.80;
					System.out.printf("Total price: %.2f", sum);
				}
				break;
			case "Business":
				if (people >= 100) {
					sum = (people * 15.60) - 156;
					System.out.printf("Total price: %.2f", sum);
				}else {
					sum = people * 15.60;
					System.out.printf("Total price: %.2f", sum);
				}
				break;
			case "Regular":
				if (people >= 10 && people < 21) {
					sum = (people * 20) * 0.95;
					System.out.printf("Total price: %.2f", sum);
				}else {
					sum = people * 20;
					System.out.printf("Total price: %.2f", sum);
				}
				break;
			}
			
			break;
			
		case "Sunday":
			switch (groupType) {
			case "Students":
				if (people >= 30) {
					sum = (people * 10.46) * 0.85;
					System.out.printf("Total price: %.2f", sum);
				}else {
					sum = people * 10.46;
					System.out.printf("Total price: %.2f", sum);
				}
				break;
			case "Business":
				if (people >= 100) {
					sum = (people * 16) - 160;
					System.out.printf("Total price: %.2f", sum);
				}else {
					sum = people * 16;
					System.out.printf("Total price: %.2f", sum);
				}
				break;
			case "Regular":
				if (people >= 10 && people < 21) {
					sum = (people * 22.50) * 0.95;
					System.out.printf("Total price: %.2f", sum);
				}else {
					sum = people * 22.50;
					System.out.printf("Total price: %.2f", sum);
				}
				break;
			}
			
			break;
		}
	}

}
