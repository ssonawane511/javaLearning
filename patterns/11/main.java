
import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        /**
         
        5
        
        * * * * *
         * * * *
          * * *
           * *
            *
           * *
          * * *
         * * * *
        * * * * *


         */

        for(int i=1; i<=number; i++)
        {

         for(int k=1; k<=i-1; k++)
         {
             System.out.print(" ");
         } 

         for(int j=1; j<=number-i+1; j++)
         {
            System.out.print("* ");
         } 

         System.out.println();
        }

        for(int i=2; i<=number; i++)
        {

         for(int k=number; k >= i+1; k--)
         {
             System.out.print(" ");
         } 

         for(int j=1; j <= i ; j++)
         {
            System.out.print("* ");
         } 

         System.out.println();
        }
    }
}