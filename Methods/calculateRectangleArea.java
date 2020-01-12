import java.util.Scanner;
public class areaRectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double w = Double.parseDouble(scanner.nextLine());
		double l = Double.parseDouble(scanner.nextLine());
		int area = areaRect(w, l);
		System.out.println(area);
	}
	
	static int areaRect(double w, double l) {
		int result = (int) (w * l);
		return result;
	}

}
