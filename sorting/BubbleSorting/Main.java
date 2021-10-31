import java.io.*;
import java.util.*;

class Main {
    
    public static void swap(int[] arr ,int i ,int j )
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int[ ] BubbleSort(int arr[],int length)
    {
        for(int i = 0 ; i < length ; i++)
        {
            boolean swappedFlag = false; 
            for(int j = 0 ; j < length-i-1 ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swappedFlag = true;
                    swap(arr,j,j+1);
                }
            }
            if(!swappedFlag)
            {
                break;
            }
       
        } 
    
        return arr;
    }

    public static void main (String args[]) throws IOException{
        Scanner scan = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());
       for(int t = 0 ; t < testCases ; t++)
        {
            String [] input = reader.readLine().replaceAll("\\s+$","").split(" ");
            int [ ] testArray = new int[input.length];
        
            for(int i = 0 ; i < input.length ; i++)
            {
                 testArray[i]= Integer.parseInt(input[i]);
            }
             int result[] = BubbleSort(testArray,input.length);
            for(int i : result)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        reader.close();
    }
}