class Animal{
    String color ;
    int i ;
    boolean flag;
    char ch ;
    double d;
    float f ;

    public Animal(String c){
        color = c ;
    }
    void eat()
    {
        System.out.println("I am eating");
    }
    void changeColour(String c)
    {
        color = c;
    }

    public static void main(String args[]) {
        Animal dog = new Animal("black");
        dog.eat();
        dog.run();
        Bird hen = new Bird();
        hen.fly();
      
        System.out.println(dog.color);
        System.out.println(dog.i );
        System.out.println(dog.flag);
        System.out.println(dog.ch) ;
        System.out.println(dog.d);
        System.out.println(dog.f );
        run();
    }
    static void run(){
        System.out.println("I am runninhg");
    }
}

class Bird {
    static void fly()
    {
        System.out.println("i am flying");
    }
}