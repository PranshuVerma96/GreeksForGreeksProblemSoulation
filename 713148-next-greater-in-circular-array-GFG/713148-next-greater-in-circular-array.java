class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> st = new ArrayDeque<>();
        
        int n = arr.length;
        
        // Initilaize anser with -1
        for(int i =0; i<n; i++){
            ans.add(-1);
        }
        
        // traverse left to right
        for(int i =0; i<2*n; i++){
            int index = i %n;
            
           while(!st.isEmpty() && arr[st.peek()] < arr[index]){
               int previousIndex = st.pop();
               
               ans.set(previousIndex , arr[index]);
           }
         if(i <n){
             st.push(index);
         }
            
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna