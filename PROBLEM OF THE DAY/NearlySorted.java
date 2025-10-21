class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
         int n = arr.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int i=0;
        int j=0;
        while(j<n){
            minHeap.add(arr[j]);
            if(minHeap.size() == k+1){
                arr[i] = minHeap.poll();
                i++;
            }
            j++;
        }
        while(minHeap.isEmpty() == false){
            arr[i++] = minHeap.poll();
        }
    }
}

