class Solution {

    static boolean isSafeToPlace(
        int rowIndex,
        int colIndex,
        int n,
        int[][] board
    ) {

        // 1. Left Horizontal
        int row = rowIndex;
        int col = colIndex;

        while (col >= 0) {

            if (board[row][col] == 1) {
                return false;
            }

            col--;
        }

        // 2. Left-Up Diagonal
        row = rowIndex;
        col = colIndex;

        while (row >= 0 && col >= 0) {

            if (board[row][col] == 1) {
                return false;
            }

            row--;
            col--;
        }

        // 3. Left-Down Diagonal
        row = rowIndex;
        col = colIndex;

        while (row < n && col >= 0) {

            if (board[row][col] == 1) {
                return false;
            }

            row++;
            col--;
        }

        return true;
    }


    static void solve(
        int[][] board,
        int n,
        int colIndex,
        ArrayList<ArrayList<Integer>> ans
    ) {

        // Base Case
        if (colIndex >= n) {

            ArrayList<Integer> temp = new ArrayList<>();

            // Har row mein queen ka column find karo
            for (int row = 0; row < n; row++) {

                for (int col = 0; col < n; col++) {

                    if (board[row][col] == 1) {

                        // GFG mein column 1-based hai
                        temp.add(col + 1);

                        break;
                    }
                }
            }

            ans.add(temp);
            return;
        }


        // Current column mein har row try karo
        for (int rowIndex = 0; rowIndex < n; rowIndex++) {

            if (isSafeToPlace(
                rowIndex,
                colIndex,
                n,
                board
            )) {

                // Place Queen
                board[rowIndex][colIndex] = 1;

                // Next column
                solve(
                    board,
                    n,
                    colIndex + 1,
                    ans
                );

                // Backtracking
                board[rowIndex][colIndex] = 0;
            }
        }
    }


    public ArrayList<ArrayList<Integer>> nQueen(int n) {

        int[][] board = new int[n][n];

        ArrayList<ArrayList<Integer>> ans =
            new ArrayList<>();

        // Start from column 0
        solve(board, n, 0, ans);

        return ans;
    }
}