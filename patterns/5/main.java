/*
7
7654321
765432
76543
7654
765
76
7
*/

import java.util.*;
class Main{
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for(int j = number ; j >= 1 ; j--)
        {
            for(int i= number ; i > number - j ; i--)
            {
                System.out.print(i);

            }
            System.out.println();
        }

         System.out.println("\n pattern 2");
        /*
        7
        76
        765
        7654
        76543
        765432
        7654321
        */
        for(int j = 1 ; j <= number ; j++)
        {
            for(int i= number ; i > number - j ; i--)
            {
                System.out.print(i);

            }
            System.out.println();
        }

        /*

        123456
        12345
        1234
        123
        12
        1
        
        */

        
         System.out.println("\npattern 3");
        for (int i = 0 ; i < number ; i++)
        {
            for(int j = 1 ; j <= number-i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}