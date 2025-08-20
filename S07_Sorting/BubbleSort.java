//Given an array, arr[]. Sort the array using bubble sort algorithm.

class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        int a, b,c,n = arr.length;
        boolean swapped;
        
        for(a = 0; a< n-1;a++){
            swapped = false;
            for(b=0;b<n-a-1;b++){
                if(arr[b]>arr[b+1]){
                   c = arr[b];
                   arr[b] = arr[b+1];
                   arr[b+1] = c;
                    swapped = true;
                }
            }
            if(swapped == false)
            break;
        }
    }
}
