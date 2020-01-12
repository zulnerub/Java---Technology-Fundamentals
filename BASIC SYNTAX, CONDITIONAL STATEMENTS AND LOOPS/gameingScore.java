import java.util.Scanner;
public class gamingStore_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double money = Double.parseDouble(scanner.nextLine());
		String input = scanner.nextLine();
		double total = money;
		while (!input.equals("Game Time") && money != 0) {
			switch (input) {
			case "OutFall 4":
				if (money >= 39.99) {
					money -= 39.99;
					System.out.println("Bought OutFall 4");
				}else {
					System.out.println("Too Expensive");
				}
				break;
			case "CS: OG":
				if (money >= 15.99) {
					money -= 15.99;
					System.out.println("Bought CS: OG");
				}else {
					System.out.println("Too Expensive");
				}
				break;
			case "Zplinter Zell":
				if (money >= 19.99) {
					money -= 19.99;
					System.out.println("Bought Zplinter Zell");
				}else {
					System.out.println("Too Expensive");
				}
				break;
			case "Honored 2":
				if (money >= 59.99) {
					money -= 59.99;
					System.out.println("Bought Honored 2");
				}else {
					System.out.println("Too Expensive");
				}
				break;
			case "RoverWatch":
				if (money >= 29.99) {
					money -= 29.99;
					System.out.println("Bought RoverWatch");
				}else {
					System.out.println("Too Expensive");
				}
				break;
			case "RoverWatch Origins Edition":
				if (money >= 39.99) {
					money -= 39.99;
					System.out.println("Bought RoverWatch Origins Edition");
				}else {
					System.out.println("Too Expensive");
				}
				break;
				default:
					System.out.println("Not Found");
					break;
			}
			input = scanner.nextLine();
		}
		if (money == 0) {
			System.out.println("Out of mo-ney!");
		}else {
			System.out.printf("Total spent: $%.2f. Remaining: $%.2f", (total - money), money);
		}
	}

}
