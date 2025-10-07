class Solution {
    public int[] sieve(int n) {
        // code here
       int[] primes = new int[n+1];
        for(int i = 2;i<=n;i++){
            primes[i] = 1;
        }
        
        for(int i = 2;i*i<=n;i++){
            if(primes[i] == 1){
                for(int j = i*i;j<=n;j=j+i){
                        primes[j] = 0;
                    }
                }
            }
             List<Integer> ans = new ArrayList<>();
        for(int i = 2;i<=n;i++){
            if(primes[i] == 1){
                ans.add(i);
            }
        }
         int[] primes2 = new int[ans.size()];
        for(int i = 0;i<ans.size();i++){
            primes2[i] = ans.get(i);
        }
         return primes2; 
    }
}