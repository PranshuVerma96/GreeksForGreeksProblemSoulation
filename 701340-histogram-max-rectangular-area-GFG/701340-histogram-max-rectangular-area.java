import java.util.*;

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
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna