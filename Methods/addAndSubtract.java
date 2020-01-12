import java.util.Scanner;
public class addAndSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());


        System.out.println(sum(a, b, c));

    }

    static int sum(int a, int b, int c){
        return ((a + b) - c);
    }


}


