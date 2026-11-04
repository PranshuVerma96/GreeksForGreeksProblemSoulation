

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans.add(i + 1);
            } else {
                ans.add(i - st.peek());
            }

            st.push(i);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna