import java.util.Scanner;
import java.math.BigDecimal;
public class bigDecimals {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int n = Integer.parseInt(scanner.nextLine());
		
		BigDecimal sum = new BigDecimal("0");
		
		for (int i = 0; i < n; i++ ) {
			BigDecimal num = new BigDecimal(scanner.nextLine());		
			sum = sum.add(num); 
		}
		System.out.println(sum);
	}

}
