class Solution {
    public int numberOfWays(int n) {
        // code here
     if(n==1) return 1;
        if(n==2) return 2;
        int[] dp= new int[n+1];
        dp[n]=1;
        dp[n-1]=2;
        for(int i=n-2; i>0; i--){
            dp[i]=dp[i+1]+dp[i+2];
        }
        return dp[1];   
    }
};