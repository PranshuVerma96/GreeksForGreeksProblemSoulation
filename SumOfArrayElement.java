class Solution {

    static int solve(int arr[], int index) {
        if (index == arr.length) {
            return 0;
        }

        return arr[index] + solve(arr, index + 1);
    }

    public int arraySum(int arr[]) {
        return solve(arr, 0);
    }
}
