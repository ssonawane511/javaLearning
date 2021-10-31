class main {

    public static void swap(int arr[], int source , int destination)
    {
        int temp = arr[source];
        arr[source ] = arr[destination] ;
        arr[destination] = temp ; 
    }

    public static int partiton(int[] arr, int low , int high) {
        int pivot = arr[low];
        int i = low ; 
        int j = high ;

        while( i < j )
        {
            while( i <= high && arr[i] <= pivot  ) i++;
            while(arr[j] >= pivot  && j > 0) j--;
            if(i < j ) swap(arr,i,j);
        }
        
        swap(arr,j,low);
        return j;
    }


    public static void quickSort( int arr[] , int low ,int high)
    {

        if(low <high)
        {
            int pivot = partiton(arr,low,high);
            quickSort(arr,low, pivot-1);
            quickSort(arr,pivot+1,high);
        }
    } 

    public static void main(String args[]) {
        int arr[] = {7,2,4,5,6};

        quickSort(arr, 0 , arr.length -1 );
 
        for(int temp : arr )
        {
            System.out.print(temp +  " ");
        }
    }


}