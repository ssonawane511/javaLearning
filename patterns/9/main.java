
import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
       
        /*
        
        1
        2 6
        3 7 10
        4 8 11 13
        5 9 12 14 15

        */
        for(int i = 1 ; i <= number ; i++)
        {
            int counter = i ;
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(counter + " ");
                counter = counter + (number - j );
            }
            System.out.println();
        }
    }
}