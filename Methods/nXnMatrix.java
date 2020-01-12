import java.util.Scanner;
public class nXnMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix(n) + " ");
        }

            System.out.println();
        }
    }

    static int matrix(int n){
         return n;
    }
}
