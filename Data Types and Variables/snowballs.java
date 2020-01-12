import java.util.Scanner;
public class snowBalls {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long best = 0;
		int bSnow = 0;
		int bTime = 0;
		int bQuality = 0;
		
		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < n; i++) {
			int snow = Integer.parseInt(scanner.nextLine());
			int time = Integer.parseInt(scanner.nextLine());
			int quality = Integer.parseInt(scanner.nextLine());
			
			long score = (long) Math.pow((snow / time),quality);
			if (score > best) {
				best = score;
				bSnow = snow;
				bTime = time;
				bQuality = quality;
			}
		}
		System.out.printf("%d : %d = %d (%d)", bSnow, bTime, best, bQuality);
	}

}
