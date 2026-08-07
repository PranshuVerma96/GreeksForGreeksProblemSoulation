class Solution {
    public static int findMean(int[] arr) {
        // code here
        int mean =0;
          int n = arr.length;
        for(int i =0; i<n; i++){
            mean += arr[i];
            
        }
      
        
        int  average = mean/n;
        return average;
    }
};
