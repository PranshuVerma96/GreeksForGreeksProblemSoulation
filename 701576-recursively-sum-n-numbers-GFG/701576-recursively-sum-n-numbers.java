class Solution {
    public int recursiveSum(int n) {
        // code here
        // base case 
        if(n== 0){
            return 0;
        }
        int result = n + recursiveSum(n-1);
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna