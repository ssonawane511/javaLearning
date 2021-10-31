
import java.util.*;

class Main {
    public static void main(String args[]) {

        /**
         * 6
           0000000
           0100000
           0020000
           0003000
           0000400
           0000050
           0000006
         */

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for(int i = 0 ; i <= number ; i++)
        {
            for(int j = 0 ; j <= number ; j++)
            {
                if(i==j)
                {
                    System.out.print(j);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}