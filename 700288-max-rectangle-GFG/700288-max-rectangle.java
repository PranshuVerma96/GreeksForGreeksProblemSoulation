class Solution {
	// Previous Smaller Element Index
	public static void findPreviousSmallerIndex(int arr[], int prev[]) {
		
		Deque<Integer> st = new ArrayDeque<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
				st.pop();
			}
			
			if (st.isEmpty()) {
				prev[i] = -1;
			} else {
				prev[i] = st.peek();
			}
			
			st.push(i);
		}
	}
	
	// Next Smaller Element Index
	public static void findNextSmallerIndex(int arr[], int next[]) {
		
		Deque<Integer> st = new ArrayDeque<>();
		int n = arr.length;
		
		for (int i = n - 1; i >= 0; i--) {
			
			while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
				st.pop();
			}
			
			if (st.isEmpty()) {
				next[i] = n;
			} else {
				next[i] = st.peek();
			}
			
			st.push(i);
		}
	}
	
	public static int getMaxArea(int arr[]) {
		
		int n = arr.length;
		
		int prev[] = new int[n];
		int next[] = new int[n];
		
		findPreviousSmallerIndex(arr, prev);
		findNextSmallerIndex(arr, next);
		
		int maxArea = 0;
		
		for (int i = 0; i < n; i++) {
			
			int height = arr[i];
			
			int width = next[i] - prev[i] - 1;
			
			int area = height * width;
			
			maxArea = Math.max(maxArea, area);
		}
		
		return maxArea;
	}
	public int maxArea(int mat[][]) {
		// code here
		int rows = mat.length;
		int cols = mat[0].length;
		
		// main iss 2D problem ko 1 d problem me convert kruga 
		int heights[] = new int[cols];
		
		int maxArea =-1; 
		// each row ko main base treat karuga and feed krduga larges area in reactuangle 
		// max areat ko trac karuga 
		for(int i=0; i<rows; i++){
		    for(int j=0;j<cols; j++ ){
		        if(mat[i][j] == 1){
		            heights[j]++;
		        }
		        else{
		            // matrix[i][j] = 0
		            heights[j] = 0;
		        }
		    }
		    
		    // ater each row addtion feed to largest area wala functin an max Area upade
		    int area = getMaxArea(heights);
		    maxArea = Math.max(maxArea, area);
		}
		return maxArea;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna