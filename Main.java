import java.util.Arrays;

class Main {

    public static void main(String[] args) {
         System.out.println("this is nice program i am writing about");
         // this program we will learn about the array copy 
         int[] a = {2,2,2,2,2,2};
         System.out.println(Arrays.toString(a));
        
        int[] newarray  = new int[a.length]; 
        // we need to declare the new array with the size 
        System.arraycopy(a,0,newarray,0,a.length);
        // here we are coping the array 
        System.out.println(Arrays.toString(newarray));
        // here we are printing the new copied array 


        ////////////////////////////////////////////////////////////////////////


        // this method is for Arrays.copyOfRange( source, starting_positin , end point )

        int[] newarray1 = Arrays.copyOfRange(a,2,9);
        System.out.println("newarray1 " + Arrays.toString(newarray1));
        

    }
}