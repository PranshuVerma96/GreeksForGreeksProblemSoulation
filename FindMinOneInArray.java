class Solution {

    int minRow(int mat[][]) {

        int n = mat.length;
        int m = mat[0].length;

        int minCount = Integer.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            if (count < minCount) {
                minCount = count;
                ans = i;
            }
        }

        // Convert to 1-based indexing
        return ans + 1;
    }
}
