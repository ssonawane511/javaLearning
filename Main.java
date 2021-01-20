public class Main {
    public static void main(String[] args){
        // Arithmatic Operators ..

         int a = 23; 
         int b = 45 ;
         // (a + b)2 = a2 + 2ab +b2
         int c = a * a + b *b + 2 * a * b ;
        System.out.println(c);
        int d = ( a+ b) * (a + b);
        System.out.println(d);

        // divide operation 

        double e = (double)b / (double)a ;
        System.out.println(e);

        // modules operataion 

        int m = a % b ;
        System.out.println(m);

        // increament operataion

        System.out.println(++c);

        /**********************************/

        // bitwise operators 

        // 10 -> 1010
        // 13 -> 1101
        // ----------
        //       1000 -> and operation    & <- operator
        //       1111 -> or operation     | <- operator
        //       0111 -> Xor operation    ^ <- operator

        // a = 1111 => 0000  ~ bitwise compliment

        

        /* 
        //right shift 

        13 -> 1101
        1101 -> 0110 -> 0011 -> 0001 -> 0000

        after each right shift the number is divided by 2 
        13 / 2 = 6.44545 
        floor value lege = 6


        left shift 
        1 => 01 
        01 << 10 << 100 << 1000
        multiply by 2 
        1 << 2 << 4 << 8
        */


        int z = 13;
        int shiftedNumber = z >> 3; // after shif == 0001
        System.out.println("z after shift " + shiftedNumber);
        
        // ********************************** //

        /* Assignment operators 

        b = a            ===> assgin 
        a = a + 2 ;      ===> a+=2 
        a = a - 2 ;      ===> a-=2
        a = a * 2 ;      ===> a*=2
        a = a % 2 ;      ===> a%=2
        a = a << 2 ;     ===> a<<=2
        a = a >> 2 ;     ===> a>>=2
        a = a & 2 ;      ===> a&=2 
        a = a | 2 ;      ===> a|=2 

        */


        /* comparison operators 

        all are boolean type operators give yes true or false 

        int a = 5; 
        int b = 10; 

        a > b  gives us false     > { greater than }
        a < b  gives us true      < { less than }
        a >= b gives us false     >= { greater than equal to }
        a <= b gives us true      <= { less than equal to}
        a == b gives us false     == { equal to e}
        a != b gives us true      != { not equal to}

        // all six are here e

        */
        

        /*   logical operators  

        logical AND ==> &&   true only if both expressions are true 
        logical OR  ==> ||   true if one of statement is true 
        logical NOT ==> !    true if expression is false and vice versa
        */

        // && operator
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // fa  lse

        // || operator  
        System.out.println((5 < 3) || (8 > 5));  // true    
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false


        /* instanceof 

        ye check krta hai ki object vahi class ka hai ky 
        suppose we have 

        String str = " sagar ";
        and we want to check is str is intanceof String class

        so 
        boolean result = str instanceof String  // this gives us true

        */

    }
}