import java.util.Scanner;
public class midleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(midChar(input));
    }

    static String midChar(String input){
         if (input.length() % 2 == 0){
             return "" + input.charAt((input.length() / 2) - 1) + input.charAt(input.length() / 2);
         }else{
             return "" + input.charAt(input.length() / 2);
         }
    }

}
