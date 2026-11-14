class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        // code here
               ArrayList<Integer> result = new ArrayList<>();

               // first traverse
               for(int i=0; i<arr.length; i++){
                   result.add(-1);
               }

               // we use monotonic stack so we need the stack 
               int n= arr.length;
               Deque<Integer> st = new ArrayDeque<>();
               // move from right to left 
               for(int i=0; i<=n-1; i++){
                   int curr = arr[i];

                   // monotonic pattern follow karege 
                   while(!st.isEmpty() && st.peek() <= curr){
                       // useless elemnt ko pop karo 
                       st.pop();
                   }
                   // ab sare usful element hoge 
                   // ans stack ya to empty hoga 
                   // ya stack k top per ek useful element hoga

                   if(!st.isEmpty()){
                       // stack k top per ek useful element he 
                       result.set(i,st.peek());
                   }
                   // baaki hume curre element o uosuh karan he 
                   st.push(curr);
               }
               return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna