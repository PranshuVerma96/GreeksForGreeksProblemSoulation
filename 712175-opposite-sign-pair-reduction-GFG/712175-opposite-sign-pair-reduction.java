
class Solution {
    public ArrayList<Integer> reducePairs(int[] arr) {

        // first you have to traverse the array
        // mujhe stack ki need padegi

        Deque<Integer> st = new ArrayDeque<>();

        for (int num : arr) {

            if (st.isEmpty()) {
                st.push(num);
            }

            else if ((st.peek() > 0 && num > 0) ||
                     (st.peek() < 0 && num < 0)) {

                // dono elements ka sign same hai
                // no collision
                st.push(num);
            }

            else {

                // dono elements ke signs opposite hain
                // collision hoga

                boolean destroyed = false;

                while (!st.isEmpty() &&
                       ((st.peek() > 0 && num < 0) ||
                        (st.peek() < 0 && num > 0))) {

                    if (Math.abs(st.peek()) > Math.abs(num)) {

                        // stack wala element greater hai
                        // current element destroyed

                        destroyed = true;
                        break;
                    }

                    else if (Math.abs(st.peek()) < Math.abs(num)) {

                        // current element greater hai
                        // stack wala element destroy ho jayega

                        st.pop();
                        continue;
                    }

                    else {

                        // dono elements ki absolute value equal hai
                        // dono destroy ho jayenge

                        st.pop();
                        destroyed = true;
                        break;
                    }
                }

                if (destroyed == false) {
                    st.push(num);
                }
            }
        }

        // mere stack ke andar final answer hai

        ArrayList<Integer> ans = new ArrayList<>();

        while (!st.isEmpty()) {
            ans.add(st.removeLast());
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna