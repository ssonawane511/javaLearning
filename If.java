import java.util.Scanner;


class If {
    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean repeat ;

      do{  
        System.out.println("enter the marks of the student"); // here we are taking grandes of user 
        int marks = input.nextInt();
        if ( marks < 40  ){
            System.out.println("C grader");
        }else if ( marks < 70 ){
            System.out.println(" B garde");
        }else {
            System.out.println(" A grade");
        }

        System.out.println("do want to continue.. 1 to continue / 0 to exit");
        repeat = input.nextBoolean();

        }while( repeat = true );
        
        input.close();  
    }
}