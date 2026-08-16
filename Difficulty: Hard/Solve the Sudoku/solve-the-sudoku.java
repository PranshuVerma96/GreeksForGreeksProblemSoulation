class Solution {
    // defnition for isSafeToPlace function 
    static boolean isSafeToPlace(int board[][],int value,int rowIndex, int colIndex){
        // check horizontal ro same row
        for(int col =0; col <9; col++){
            if(board[rowIndex][col] == value){
                return false;
            }
        }
        // check for vertical or same column 
        for(int row =0; row<9; row++){
            if(board[row][colIndex] == value){
                return false;
            }
        }
        // check for current 3*3 wal sub box
        int startRow = rowIndex - rowIndex%3;
        int startCol = colIndex - colIndex%3;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int actualRow = startRow + i;
                int actualCol = startCol + j;
                
                if(board[actualRow][actualCol] == value){
                    return false;
                }
            }
        }
        return true;
    }
    // defnition of find Empty cell 
    static boolean findEmptyCell(int board[][] , int emptyCell[]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == 0){
                    // store empty cell kei row
                    emptyCell[0] = i;
                    // store empty cell ka col 
                    emptyCell[1] = j;
                    
                    // mi gay to return 
                    return true;
                }
            }
        }
        // nahi to return 
        return false;
    }
    // defnition solve sudoku helper 
    static boolean solveSudokuHelper(int mat[][]){
        // base case 
        int [] emptyCell = new int[2];
        if(!findEmptyCell(mat,emptyCell)){
            return true;
        }
        // if 
        int rowIndex = emptyCell[0];
        int colIndex = emptyCell[1];
        
        for(int value =1; value<=9; value++){
            int intValue = value;
            if(isSafeToPlace(mat,value,rowIndex,colIndex)){
                // place kar do 
                mat[rowIndex][colIndex] = value;
                
                // baki recursion 
                if(solveSudokuHelper(mat)== true){
                    return true;
                }
                // ager isa nahi he 
                // backtracking vala step 
                mat[rowIndex][colIndex] =0;
            }
        }
        // not solve
        return false;
        
    }
    public void solveSudoku(int[][] mat) {
        // code here
        solveSudokuHelper(mat);
    }
}