// Butterfly Pattern

import java.util.Scanner;
public class Pattern15{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int n = sc.nextInt();
       for(i = 0; i < n; i++)
        {
            for(j = 0; j < (2 * n); j++)
            {
                if(i >= j)  
                    System.out.print("*");
                else
                    System.out.print(" ");
                if(i >= (2 * n - 1) - j) 
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
     for(i = 0; i < n; i++)
        {
            for(j = 0; j < (2 * n); j++)
            {
                if(i + j <= n - 1) 
                    System.out.print("*");
                else
                    System.out.print(" ");
                if((i + n) <= j) 
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}