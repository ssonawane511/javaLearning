import java.util.Scanner ;  // this package gives us the function to take input 

class Input {
    public static void main( String[] args ){ //  start method 
        Scanner input = new Scanner(System.in); // declared a scanner variable to take input 
        System.out.println("enter a number "); // print statement 
        int number = input.nextInt();  // nextInt function to take integral
        /* 
        nextBoolean() ==> to take boolean input ( true /false )
        nextFloat () ==> to take float input ( 0.5550)
        nextDouble() ==> to take double input (0.454554855)
        next() ==> to take the string input
        */
        System.out.println("you entered number is " + number);
        input.close();
        // dont forget to close the function 
    }
}