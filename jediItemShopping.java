package Exercise_01;
import java.util.Scanner;
public class padawanEquipment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double money = Double.parseDouble(scanner.nextLine());
		int students = Integer.parseInt(scanner.nextLine());
		double lightsabersPrice = Double.parseDouble(scanner.nextLine());
		double robesPrice = Double.parseDouble(scanner.nextLine());
		double beltsPrice = Double.parseDouble(scanner.nextLine());
		
		double sum = 0;
		
		double numSabers = Math.ceil(students * 1.1);
		
		double sumSabers = numSabers * lightsabersPrice;
		double sumRobes = students * robesPrice;
		double sumBelts = (students - (students / 6)) * beltsPrice;

		sum = sumSabers + sumRobes + sumBelts;
		
		if (sum <= money) {
			System.out.printf("The money is enough - it would cost %.2flv.", sum);
		}else {
			System.out.printf("Ivan Cho will need %.2flv more.", (sum - money));
		}
	}

}
