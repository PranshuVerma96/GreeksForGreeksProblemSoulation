class Solution {
    static int solve(ArrayList<ArrayList<Integer>> triangle, int rowIndex, int colIndex){
        // base case 
        if(rowIndex == triangle.size()-1){
            return triangle.get(rowIndex).get(colIndex);
        }
        int downAns = solve(triangle, rowIndex+1, colIndex);
        int diaonalAns = solve(triangle, rowIndex+1, colIndex+1);
        
        // 1 case solution 
        int finalAns = triangle.get(rowIndex).get(colIndex) + Math.min(downAns, diaonalAns);
        return finalAns;
    }
    public int minPathSum(ArrayList<ArrayList<Integer>> triangle) {
        // Code here
        
        int rowIndex = 0;
        int colIndex = 0;
        
        int ans = solve(triangle, rowIndex, colIndex);
        return ans;
    }
}
