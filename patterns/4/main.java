/*

5
12345
1234
123
12
1
12
123
1234
12345

*/


import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner scan  = new Scanner(System.in);
        int number = scan.nextInt();

        for(int j = number ; j >= 1 ; j--)
        {
            for(int i = 1 ; i <= j ; i++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        for(int k = 2 ; k <= number ; k++)
        {
            for(int i = 1 ; i <= k ; i++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}