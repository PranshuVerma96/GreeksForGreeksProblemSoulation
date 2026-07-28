class Solution {
    static boolean isPrime(int n) {
        // code here
        int isPrime = 1;
        if(n<=1){
            return false;
        }
        
        for(int i=2; i<n; i++){
            if(n%i ==0){
                isPrime = 0;
            }
        }
        if(isPrime ==0){
            return false;
        }else{
            return true;
        }
    }
}
