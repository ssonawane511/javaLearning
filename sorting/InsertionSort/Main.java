// import files 
import java.io.*;
import java.util.*;
// class
class Main {

 public static int[] insertionSort (int[] arr )
 {
    int length = arr.length;
    //base case
    // if(length<2)
    // {
    //     return arr;
    // }
    
    for(int i = 1 ; i < length ; i++ )
    {
        int temp = arr[i];
        int j = i -1 ;
        while(j >= 0 && temp < arr[j])
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1]= temp ;
    }

    return arr;
 }

 public static void main(String args[]) throws IOException 
 {
    Scanner scan = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int testCases = Integer.parseInt(reader.readLine());
    String [] inputArray = reader.readLine().replaceAll("//s+$","").split(" ");
    int [] testArray = new int[inputArray.length];
    for(int i = 0 ; i < inputArray.length ; i++)
    {
        testArray[i]= Integer.parseInt(inputArray[i]);
    }
    int resultArray[] = insertionSort(testArray);

    for(int temp : resultArray)
    {
        System.out.print(temp + " ");
    }


 }
// insertion sort function 
/* 
params 
int[] arr
*/

// main 

}
