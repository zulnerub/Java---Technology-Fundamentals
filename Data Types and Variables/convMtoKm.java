package dataTypesAndVaruables_02;
import java.util.Scanner;
public class metersToKm_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double metters = Integer.parseInt(scanner.nextLine());
		double km = metters / 1000;
		
		System.out.printf("%.2f", km);
	}

}