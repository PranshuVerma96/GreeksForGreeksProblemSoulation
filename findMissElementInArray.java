class Solution {
    int missingNum(int arr[]) {

        int n = arr.length + 1;

        int xor1 = 0;
        int xor2 = 0;

        // XOR of 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        //  XOR of array
        for (int num : arr) {
            xor2 ^= num;
        }

        return xor1 ^ xor2;
    }
}
