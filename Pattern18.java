// 7 in * form pattern .

public class Pattern18
{ 
    public static void main(String[] args) 
    { 
        int rows = 5; 
        for (int i= 1; i<= rows; i++) 
        { 
            for (int j=1; j < i; j++) 
            { 
                System.out.print(" "); 
            } 
            for (int k=i; k<=rows; k++) 
            { 
                if(i==1 || k==rows) 
                    System.out.print("* "); 
                else
                    System.out.print("  "); 
            } 
            System.out.println(); 
        } 
    } 
}