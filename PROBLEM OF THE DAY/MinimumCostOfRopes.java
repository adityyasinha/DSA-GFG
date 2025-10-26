class Solution {
    public static int minCost(int[] arr) {
        // code here
         int n=arr.length;
        if(n==1)return 0;
        if(n==2)return arr[0]+arr[1];
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int a:arr)pq.add(a);
        
        int Totalcost=0;
        while(!pq.isEmpty() && pq.size()>=2){
            int rope1=pq.poll();
            int rope2=pq.poll();
            
            int ropeSum=rope1+rope2;
            Totalcost+=ropeSum;
            
            pq.add(ropeSum);
        }
        
        return Totalcost;
    }
}