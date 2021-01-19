import java.util.Scanner;


public class SimpleInterest {

       static Scanner scan = new Scanner( System.in);

    static void simpleInterestCalc() {
        
        System.out.println("please enter the principal ammount ");
        int principal = scan.nextInt();
        System.out.println("please enter the rate of interest ");
        float rate = scan.nextInt();
        System.out.println("please enter the time ");
        int time = scan.nextInt() ;
        float simpleInterest = principal * rate * time / 100 ;
        System.out.println("the simple interest is " + simpleInterest);
        
    }


    public static void main(String[] args){

            int c = 1 ;

            do {
            System.out.println("=== Simple Interets Calculator ==");
            simpleInterestCalc();
            
            System.out.println("Do You want to continue ");
            System.out.println(" yes == 1 || no == 0");
            c  = scan.nextInt();
            }while(c != 0);
            
            
    }
}