/*
5
11111
11122
11333
14444
55555
*/


import java.util.*;

class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for(int i = 1 ; i <= number ; i++)
        {
            for(int j = number-i ; j>0 ; j--)
            {
                System.out.print(1);
            }
            for(int k = 1 ; k <= i ; k++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}