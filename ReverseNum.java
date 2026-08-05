class Solution {
    public int reverseDigits(int n) {
        // Code here
       
    // first of all you have to inilatize a variable using 0
        int rev = 0;
        
        
        // check num is > 0 or not 
        
        while(n>0){
            
            // this is find digit logic
        int digit = n%10;
        rev = rev*10 + digit;
        n= n/10;
    }
       return rev;
    }
    
}
