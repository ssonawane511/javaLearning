import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        //automatic type casting 
        // shadowing 
        byte a = 4 ;
        short c = a ;
        // char c = b ;
        int d = c ;
        long e = d ;
        float f = e ;
        double g = f ; 
        // manual type casting 
        // narrowing 

        double myDouble = 3.14 ; // this is bigger datatype
        int myInt = (int) myDouble ; // this is small datatype
        System.out.printf("%d %n%2f %n",myInt,myDouble);

        // taking input from the user 
        System.out.println("enter the input here");
        int inputVariable = scan.nextInt();// taking interger input 
        // nextDouble()
        // nextShort()
        // nextLong()
        // nextFloat
        System.out.println("your entered input  => " + inputVariable);
        scan.nextLine();
        System.out.printf("%nnow enter a string please");
        String s = scan.nextLine();
        System.out.println("entered string is => " + s);








    }
}


