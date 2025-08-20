//Given an array arr[] of positive integers.The task is to complete the insertsort() function which is used to implement Insertion Sort.

class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
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