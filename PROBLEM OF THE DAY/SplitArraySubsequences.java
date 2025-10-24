class Solution {
 class Pair implements Comparable<Pair>{
        int lastEl; // last element of current subsequence (greatest)
        int length; // size of current subsequence
        Pair(int lastEl, int length){
            this.lastEl = lastEl;
            this.length = length;
        }
        public int compareTo(Pair p){
            if(this.lastEl==p.lastEl) return this.length-p.length; // ascending order of length if lastEl are same
            return this.lastEl-p.lastEl; // ascending order last element 
        }
    }
    public boolean isPossible(int[] arr, int k) {
        // Code here
         PriorityQueue<Pair> pq = new PriorityQueue<>(); // min-heap [lastEl, length of curr]
        
        int n = arr.length;
        int idx = 0; // to iterate over array
        while(idx<n){
            if(pq.isEmpty()){ // if no subseq yet
                pq.offer(new Pair(arr[idx], 1)); // just start a new subseq
                idx++;
            }else{
                Pair curr = pq.peek(); // subseq with smallest lastEl(largest in curr subseq but smallest among other subseq)
                if(curr.lastEl==arr[idx]){ // if current last ele and arr[i] are equal
                    // we should start new subseq
                    pq.offer(new Pair(arr[idx], 1));
                    idx++;
                }else if(curr.lastEl+1==arr[idx]){ // consecutive found
                    pq.poll(); // remove the curr subseq
                    pq.offer(new Pair(arr[idx], curr.length+1)); // add the updated subseq with increased length and updated last el
                    idx++;
                }else{
                    if(curr.length<k) return false; // at any instance if subseq ended with length < k => return false
                    pq.poll(); // else remvove this valid subseq
                }
            }
        }
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            if(curr.length<k) return false; // if there's any subseq with length<k return false
        }
        return true;
    }
}