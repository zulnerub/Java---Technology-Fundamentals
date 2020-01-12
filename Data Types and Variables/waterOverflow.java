import java.util.Scanner;
public class waterOverflow {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int capacity = 255;
		int filled = 0;
		
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < n; i++) {
			int litters = Integer.parseInt(scanner.nextLine());
			if (litters > capacity) {
				System.out.println("Insufficient capacity!");
			}else {
				capacity -= litters;
				filled += litters;				
			}
		}
		System.out.println(filled);
	}

}
