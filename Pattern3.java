
import java.util.*;

public class Pattern3 {

    public static void main(String args[]) {
        System.out.println("Please enter n :-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i, j;

        for (i = 0; i < n; i++) {
            for (j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {
                System.out.print("* ");

            }

            System.out.println();
        }
    }
}