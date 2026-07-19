class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // code here
        int totalRow = mat.length;
        int totalCol = mat[0].length;
        
        int row =totalRow -1;
        int col =0;
         
         // is me bi hum right and bottom approach follow karge 
        while(col < totalCol && row>=0){
            if(mat[row][col]==x){
                return true;
            }
            else if(mat[row][col] >x){
                row--;
            }
            else{
                col++;
            }
        }
        // if kush nah mile to 
        return false;
    }
}
