
/*
5
1
12
123
1234
12345
1234
123
12
1
*/

import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for(int i = 1 ; i <= number ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int k = number-1 ; k >= 1 ; k--)
        {
             for(int j = 1 ; j <= k ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}