import java.util.Scanner;
public class beerKegs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		String biggest = "";
		double vol0 = 0;
		double vol1 = 0;
		
		for (int i = 0; i < n; i++) {
			String model = scanner.nextLine();
			double radius = Double.parseDouble(scanner.nextLine());
			int height = Integer.parseInt(scanner.nextLine());
			vol1 = Math.PI * radius * radius * height;
			if (vol1 > vol0) {
				vol0 = vol1;
				biggest = model;
			}
		}
		System.out.println(biggest);
	}

}
