class Solution {
    public int countMinReversals(String s) {
        
        // odd length 
        if(s.length()%2 == 1){
            return -1;
        }
        
        int open = 0; 
        int close = 0;
        
        for(char ch : s.toCharArray()){
            //  cance out
            if(ch == '}' && open>0){
                open--;
            }
            else{
                if(ch =='{'){
                    open++;
                }
                else if(ch == '}'){
                    close++;
                }
            }
           
        }
         return (open + 1) / 2 + (close + 1) / 2;
            
    }  
}
        // Deque<Character> st = new ArrayDeque<>();
        // // code here
        // // if length of string is ans is impossible 
        
        // if(s.length() % 2 == 1){
        //     return -1;
        // }
        // // remove all valid bracjets pairs keeps al the unmatch brackets inside the stack only
        // for(char ch : s.toCharArray()){
        //     // cancelout
        //     if(ch == '}' && !st.isEmpty() && st.peek() == '{'){
        //         st.pop();
        //     }
        //     else{
        //         // pusch kare ka logic
        //         st.push(ch);
        //     }
        // }
        // // count open and close bracter
        // int open = 0;
        // int close = 0;
        
        // while(!st.isEmpty()){
        //     if(st.peek() == '{'){
        //         open++;
        //     }
        //     else{
        //         close++;
        //     }
        //     st.pop();
        // }
        // // find the total number of reversal as per the formula we discrused earlier
        // if(open %2 == 0){
        //     // even
        //     int ans = (open/2) + (close/2);
        //     return ans;
        // }
        // else{
        //     // odd
        //     return (close - 1)/2 + 2 + (open-1)/2;
    

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna