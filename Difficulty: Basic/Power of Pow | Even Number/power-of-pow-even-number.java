class Solution {
    public int sumSqEven(int n) {
        int sum = 0;

        for(int i = 2; i <= 2 * n; i += 2) {
            sum += i * i;
        }

        return sum;
    }
}