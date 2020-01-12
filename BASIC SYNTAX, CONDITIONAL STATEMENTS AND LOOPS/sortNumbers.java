import java.util.Scanner;
public class sort_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for (int i = 0; i < 3; i++) {
			int num = Integer.parseInt(scanner.nextLine());
			if (num > first) {
				third = second;
				second = first;
				first = num;
			}else if (num > second) {
				third = second;
				second = num;
			}else if (num > third) {
				third = num;
			}
		}
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}

}
