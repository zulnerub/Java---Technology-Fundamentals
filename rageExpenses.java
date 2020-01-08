package Exercise_01;
import java.util.Scanner;
public class rageExpense {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int games = Integer.parseInt(scanner.nextLine());
		double hPrice = Double.parseDouble(scanner.nextLine());
		double mPrice = Double.parseDouble(scanner.nextLine());
		double kPrice = Double.parseDouble(scanner.nextLine());
		double dPrice = Double.parseDouble(scanner.nextLine());
		
		int hTrash = games / 2;
		int mTrash = games / 3;
		int kTrash = games / 6;
		int dTrash = games / 12;
		
		double rExp = hPrice * hTrash + mPrice * mTrash + kPrice * kTrash + dPrice * dTrash;
		System.out.printf("Rage expenses: %.2f lv.", rExp);
	}

}
