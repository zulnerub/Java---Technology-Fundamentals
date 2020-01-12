import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(smallest(a, b, c));
    }

    static int smallest(int a, int b, int c){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++){
            if (a < smallest){
                smallest = a;
            }else if (b < smallest){
                smallest = b;
            }else if ( c < smallest){
                smallest = c;
            }
        }

        return smallest;
    }

}
