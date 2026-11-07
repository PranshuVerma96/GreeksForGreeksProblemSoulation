class Solution {
    public String removeKdig(String s, int k) {

        Deque<Character> st = new ArrayDeque<>();

        // Step 1: Monotonic Stack
        for (char ch : s.toCharArray()) {

            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }

            st.push(ch);
        }

        // Step 2: Remove remaining digits
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // Step 3: Build answer
        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        ans.reverse();

        // Step 4: Remove leading zeros
        int index = 0;

        while (index < ans.length() && ans.charAt(index) == '0') {
            index++;
        }

        String result = ans.substring(index);

        return result.length() == 0 ? "0" : result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna