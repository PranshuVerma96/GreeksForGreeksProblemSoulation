class Solution {
    static int sumOfDigits(int n) {
        // code here
        if(n==0){
            return 0;
            
        }
        
        int sum =0;
        int digit = n%10;
        
        
        // recursive call 
        return sum +digit +  sumOfDigits(n/10);
        
        
    }
}
