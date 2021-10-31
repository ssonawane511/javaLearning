class Demo {
    /**
     * param int a -> first number
     * param int b -> second number
     * return a * b
     */
    static int test1(int a , int b )
    {
        return a * b ;
    }


    /**
     * param float a -> first number
     * param float b -> secong number
     * return (float) a * b ;
     */
    //@Overloading
    static double test1(double a , int b )
    {
        return (double)(a) ;
    }
}

class Main{
    public static void main(String args[]) {
        System.out.println(Demo.test1(4,5));
        System.out.println(Demo.test1( 3.5333 , 4 ));
    }
}