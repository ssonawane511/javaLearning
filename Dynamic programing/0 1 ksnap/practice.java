class pracKsnap{

    public static void main(String args[])
    {

        int maxweight = 10 ;
        int maxelements = 4 ; 
        int weights[] = {1,3,4,6};
        int profits[] = {20,30,10,50};
        int profitMat[][] = new int[maxelements+1][maxweight+1];

        for(int i = 1 ; i<= maxelements ; i++)
        {
            for(int capacity = 1 ; capacity <= maxweight ; capacity++)
            {
                int maxValWithOutCurr = profitMat[i-1][capacity];
                int maxValWithCurr = 0 ;
                int weightOfCurr = weights[i-1];

                if(capacity >= weightOfCurr)
                {
                    maxValWithCurr = profits[i-1];

                    int remainingCapacity = capacity - weightOfCurr;
                    maxValWithCurr += profitMat[i-1][remainingCapacity];

                }

                profitMat[i][capacity] = Math.max(maxValWithCurr,maxValWithOutCurr);
            }
        }
        System.out.println(profitMat[maxelements][maxweight]);
    }


}