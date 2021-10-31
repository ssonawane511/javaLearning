
import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        /**
        1
        10
        101
        1010
        10101
        101010
        1010101
        */
        for(int i = 1 ; i <= number ; i++)
        {
           for(int j = 1 ; j <= i ; j++)
           {
               if(j%2==0)
               {
                   System.out.print(0);
               }else{
                   System.out.print(1);
               }
           }
           System.out.println();
        }


        System.out.println();
        System.out.println();

        /**
        101010
        010101
        101010
        010101
        101010
        010101
         */
        for(int i = 1 ; i <= number ; i++)
        {
           for(int j = 1 ; j <= number ; j++)
           {

                if(i%2 == 0 )
                {
                   if(j%2==0)
                    {
                        System.out.print(1);
                    }else{
                        System.out.print(0);
                    } 
                }else
                {
                    if(j%2==0)
                    {
                        System.out.print(0);
                    }else{
                        System.out.print(1);
                    }
                }

               
           }
           System.out.println();
        }



    }
}