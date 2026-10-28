class Solution {
    public int maxLength(String s) {
        // code here
        // we slove this question useing variable help 
        int open = 0; 
        int close = 0; 
        int maxLen = 0; 
        
        
        // travese left to right 
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }
            else{
                close ++;
            }
            
            if(close > open){
                // invalid case 
                // reset kardo 
                close = 0; 
                open =0;
            }
            else if(open == close){
                maxLen = Math.max(maxLen, 2*close);
            }
        }
        
        
        
        // traversal right to left 
        
        open = 0;
        close = 0;
        
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch == '('){
                open ++;
            }
            else{
                close++;
            }
            
            if(open > close){
                // invalid case 
                // reset kar do 
                open =0; 
                close = 0;
            }
            else if(open == close){
                // valid case 
                maxLen = Math.max(maxLen,2*open);
            }
            
        }
        // final ans yaha retturn karo max len 
        return maxLen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna