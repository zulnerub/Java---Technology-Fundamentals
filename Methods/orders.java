import java.util.Scanner;
public class orders {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String order = scanner.nextLine();
		int qua = Integer.parseInt(scanner.nextLine());
		
		switch (order) {
		case "coffee":
			multiply(qua, 1.50);
			break;
		case "water":
			multiply(qua, 1.00);
			break;
		case "coke":
			multiply(qua, 1.40);
			break;
		case "snacks":
			multiply(qua, 2.00);
			break;
		}
		
	}
	static void multiply(int qua, double b) {
		double sum = qua * b;
		System.out.printf("%.2f", sum);
	}

}
