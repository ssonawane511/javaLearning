import java.util.*;
/*

6
1
121
12321
1234321
123454321
12345654321

*/
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for(int i = 1 ; i <= number ; i++)
        {
            int count = -1 ;
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(j);
                count++ ;
            }
            for(int k = count ; k >= 1 ; k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }



    }
}