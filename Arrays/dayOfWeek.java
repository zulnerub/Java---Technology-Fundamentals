import java.util.Scanner;
public class dayOfWeek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] arr = {
				"Monday",
				"Tuesday",
				"Wednesday",
				"Thursday",
				"Friday",
				"Saturday",
				"Sunday"
		};
		
		int num = Integer.parseInt(scanner.nextLine());
		
		if (num > 0 && num < 8 ) {
			System.out.println(arr[num - 1]);
		}else {
			System.out.println("Invalid day!");
		}
	}

}
