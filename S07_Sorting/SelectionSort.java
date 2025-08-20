//Given an array arr, use selection sort to sort arr[] in increasing order.

class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int a = 1; a<n;a++){
            int b = arr[a];
            int c = a-1;
            while(c>=0 && arr[c] > b){
                arr[c+1] = arr[c];
                c--;
            }
            arr[c+1] = b;
        }
    }
}