class Solution {
    // definition of solve function 
    static boolean solve(int arr[], int k, int index,int sum){
        // base case 
        
        if(index >= arr.length){
            // iska matlab sub sequence ready he 
            if(sum == k){
                return true;
            }
            else{
                return false;
            }
        }
        
        // 1 recurison ki one line 1 case solve karo 
        // includePattern 
        int currentValue = arr[index];
        
        boolean includeAns = solve(arr, k, index+1, sum + currentValue);
        
        // exclude pattern 
        boolean excludeAns = solve(arr, k, index+1, sum);
        
        boolean finalAns = includeAns || excludeAns;
        
        return finalAns;
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        int index =0;
        int sum = 0;
        boolean ans = solve(arr, k, index, sum);
        
        return ans;
    }
}
