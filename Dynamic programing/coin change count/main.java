import java.util.*;
class Coinchange {
    /**
     * you have given an coins array and the target find the minimum coins for change
     * 
     * input 18
     * output 4
     * 
     * approach here is 
     * find all the possible coins for any target and return the minimum 
     * 
     * recursion to find all the possible answers
     * then dp i.e. memo to store the ans for purning -( not going forward)
     */

    public static void main(String args[])
    {
        int target = 18;
        int coins[] = {7,5,1};
        int dp[] = new int[target+1];
        Arrays.fill(dp,-1);
        // base conditions 
        dp[0]=0;
        // call the mincount function
        int ans = minCountCoin(18,coins,dp);
        System.out.println(ans);
        // content in memo
        for(int x  : dp)
        {
            System.out.print(x + " ");
        }
    }


    static int minCountCoin(int target , int[] coins ,int [] dp )
    {
        // base condition
        if(target == 0) return 0 ; 
        // at evey target keep min coin as highest for comparison

        int minCoins = Integer.MAX_VALUE;
        
        
        for(int i = 0 ; i < coins.length ; i++)
        {
            // first check if we minus the coin the target must be bigger than 0 or equal
            if( target-coins[i] >= 0 )
            {   
                // coint for the sub targer
                int subTarget  = 0 ;
                // check for memo if already computed then return subans 
                if(dp[target-coins[i]] != -1 )
                {
                    subTarget = dp[target-coins[i]];
                }
                else 
                {
                    // else compute 
                    subTarget = minCountCoin(target-coins[i], coins , dp);
                }
                // compare if the coint is minimum 
                if(subTarget != Integer.MAX_VALUE && subTarget + 1 < minCoins)
                {
                    minCoins = subTarget + 1 ;
                }

            }
        }

        return dp[target] =  minCoins ; 
    }
}