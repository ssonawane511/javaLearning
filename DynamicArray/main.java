import java.util.*;

public class main extends DynamicArray {

    public static void main(String args[])
    {
        DynamicArray arr = new DynamicArray(2);
        System.out.println(arr.size());
        arr.add("sagar sonawane");
        arr.add(34);
        arr.add(566);
        arr.add('c');
        Iterator<DynamicArray> it = arr.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println(arr.toString());


        System.out.println("hello this is sagar sonawane");
    }
}