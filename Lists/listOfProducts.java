import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listProductsOrdered {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		List<String> products = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			products.add(sc.nextLine());
		}
		
		Collections.sort(products);
		
		for (int j = 0; j < products.size(); j++) {
			System.out.println((j + 1) + "." + products.get(j));
		}
		
	}

}
