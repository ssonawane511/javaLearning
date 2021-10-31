class Main {

    public static void main( String args[]) {

        int arr [] = { 1,55,2,344,23,432,212,32,1,245,54,23};
        int temp[] = new int[2];
        temp[0] = arr[0];

        for (int i = 1 ; i < arr.length ; i++ )
        {
            if(arr[i] > temp[0])
            {
                int a = temp[0];   
                temp[0] = arr[i];
                temp[1] = a;
            }
            if(temp[0] > arr[i] && arr[i] > temp[1])
            { 
                temp[1] = arr[i];
            }
        }
        
        System.out.println(temp[1]);

    }


}