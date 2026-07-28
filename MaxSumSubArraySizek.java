class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
       int current = 0;
       int n = arr.length;
       // loop to find the sum of slide 
       for(int i=0; i<k; i++){
           current += arr[i];
       }
        
        int max = current;
        
        // second loop iterate the loop after calue 
        for(int i=k; i<n; i++){
            current = current - arr[i-k]+ arr[i];
            
            if(current >max){
           max = current;
        }
        }
        
        
     
     return max;  
    }
    
}
