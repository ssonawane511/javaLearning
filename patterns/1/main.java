/*
1
12
123
1234
12345
123456
*/

import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        // number input
        int number = scan.nextInt();

        // iterte whole number
        for(int i = 1 ; i <= number ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }    
    }
}