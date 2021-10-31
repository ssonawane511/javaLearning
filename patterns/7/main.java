import java.util.*;

class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        /*
        6
        123456
         23456
          3456
           456
            56
             6
            56
           456
          3456
         23456
        123456
        */
        
        for(int i = 1 ; i <= number ; i++ )
        {
            for(int j = 1 ; j < i ; j++  )
            {
                System.out.print(" ");
            }
            for(int k = i ; k <= number ; k++ )
            {
                System.out.print(k);
            }
            System.out.println();
        }
        for(int i = 2 ; i <= number ; i++ )
        {
            int j ;
            for( j = 1 ; j <= number-i ; j++)
            {
                System.out.print(" ");
            }
            for(int k = j  ; k <= number ; k++ )
            {
                System.out.print(k);
            }
            System.out.println();
        }

    }
}