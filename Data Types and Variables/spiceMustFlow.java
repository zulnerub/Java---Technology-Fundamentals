import java.util.Scanner;
public class spiceMustFlow {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int source = Integer.parseInt(scanner.nextLine());
		int mined = 0;
		int count = 0;
		
		while (source >= 100) {
			mined += source;
			source -= 10;
			if (mined < 26) {
				mined = 0;
			}else {
				mined -= 26;
			}
			count++;
		}
		if (mined < 26) {
			mined = 0;
		}else {
			mined -= 26;
		}
		System.out.println(count);
		System.out.println(mined);
	}

}
