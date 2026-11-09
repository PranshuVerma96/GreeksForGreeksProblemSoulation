class Solution {
	public int celebrity(int mat[][]) {
		// code here
		Deque<Integer> st = new ArrayDeque<>();
		int n = mat.length;
		// put all indivials in the stack
		for (int i = 0; i<n; i++) {
			st.push(i);
		}
		
		// stack elemination pattern -> 2 element ko pop karuga check karo
		while (st.size() > 1) {
			int a = st.pop();
			int b = st.pop();
			
			if (mat[a][b] == 1) {
				// a knows b
				// a is not celb
				
				// b might be celb
				st.push(b);
			}
			else {
				// a does not konw
				// b is not clen
				// a might be celeb
				st.push(a);
			}
		}
		// top appke stack me 1 elemtn tbacka hua hoga. jo ki partenital canditae h ceb hone ka
		//  celb kisi ko nahi hanta and celb ko sab jannte he
		int celebIndex = st.pop();
		// int cond1 = true;
		
		for (int i = 0; i<n; i++) {
			if (i!= celebIndex &&  mat[celebIndex][i] == 1) {
				return - 1;
			}
			
		}
		// celb ko sab jante he
		for (int i = 0; i<n; i++) {
			if (i != celebIndex) {
				if (mat[i][celebIndex] == 0) {
					return - 1;
				}
			}
		}
		
		// agar dpno me -1 nahi a isa ka matlab celbIndex he celberith he
		return celebIndex;
		
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna