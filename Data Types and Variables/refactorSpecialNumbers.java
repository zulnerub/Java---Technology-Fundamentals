import java.util.Scanner;
public class refactorSpecialNums {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = Integer.parseInt(scanner.nextLine());
		int total = 0;
		
		String check;
		
		
		for (int i = 1; i <= input; i++) {
			int num = i;
			while (i > 0) {
				total += i % 10;
				i = i / 10;
		}
			
		boolean trueOrFalse = (total == 5) || (total == 7) || (total == 11);
		if (trueOrFalse) {
			check = "True";
		}else {
			check = "False";
		}
		
		System.out.printf("%d -> %s%n", num, check);
		total = 0;
		i = num;
		}
	}

}
