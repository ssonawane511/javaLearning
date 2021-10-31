import java.util.*;
class Main{

    public static void swap(int [] arr, int source, int destination) {
        int temp = arr[source];
        arr[source] = arr[destination];
        arr[destination] = temp;
    }

    public  static int[] selectionSort(int[] arr) {
        // iterate to 0 => arr.length-1
        final int N = arr.length;
        
        for(int i = 0 ; i < N ; i++)
        {
            int min = i ;
            for(int j = i + 1 ; j < N ; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j ; 
                }
            }

            if(min != i )
            {
                swap(arr,i,min);
            }

        }
        return arr;
    }

    public static void main(String[] args ) {
        
        Scanner scan = new Scanner(System.in);
        String testArray[] = scan.nextLine().replaceAll("//s+$","").split(" ");
        int inputArray[] = new int[testArray.length];
        for(int i = 0 ; i < testArray.length ; i++)
        {
            inputArray[i] = Integer.parseInt(testArray[i]);
        }
        int result [] = selectionSort(inputArray);
        for(int temp : result)
        {
            System.out.print(temp + " ");
        }
    }

}