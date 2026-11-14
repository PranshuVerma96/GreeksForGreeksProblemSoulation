class Solution {
	public ArrayList<Integer> nextLargerElement(int[] arr) {
	    
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
            for(int i=n-1; i>=0; i--){
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
// 		// code here
// 		ArrayList<Integer> ans = new ArrayList<>();
		
// 		Deque<Integer> st = new ArrayDeque<>();
// 		int n = arr.length;
		
// 		for (int i = n - 1; i >= 0; i--) {
			
// 			while (!st.isEmpty() && st.peek() <= arr[i]) {
// 				st.pop();
				
// 			}
// 			if (st.isEmpty()) {
// 				ans.add(-1);
// 			}
// 			else {
// 				ans.add(st.peek());
// 			}
// 			st.push(arr[i]);
// 		}
		
// 		Collections.reverse(ans);
		
// 		return ans;
		
		// // first traver the all array
		
		// int n = arr.length;
		// for(int i =0; i<n; i++){
		//          boolean found = false;
		//     for(int j =i+1; j<n; j++){
		//         if(arr[j] > arr[i]){
		//             ans.add(arr[j]);
		//             found = true;
		//             break;
		//         }
		
		//     }
		//      if(found == false){
		//           ans.add(-1);
		//       }
		// }
		
		// return ans;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna