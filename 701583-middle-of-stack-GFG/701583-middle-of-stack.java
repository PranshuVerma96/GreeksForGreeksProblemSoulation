class Solution {
    public int stackMiddle(Stack<Integer> st) {
        // code here
        int size = st.size();
        
        int middle = size/2;
        int count = 0;
        
        while(count < middle){
            st.pop(); 
             count ++;
            
           
        }
        return st.peek();
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna