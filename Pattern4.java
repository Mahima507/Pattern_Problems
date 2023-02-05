
import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:- ");

        int r = sc.nextInt();

        for (int i = r; i >= 1; i--) {
            for (int j = r; j > i; j--) {
                System.out.print(" "); // Prints Blank space
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // Prints *
            }

            System.out.println(" "); // Prints blank spaces
        }
    sc.close();
    }
}