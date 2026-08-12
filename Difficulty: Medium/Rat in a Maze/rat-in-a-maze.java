class Solution {
    // definition of isPossibleTo move function 
    static boolean isPossibleToMove(int newX,int newY,int n,int [][]maze, boolean visited[][]){
        // check 
        // out of bound bala case 
        if(newX<0 || newX>=n || newY <0 || newY>=n  ){
            return false;
        }
        // block sell bala case
        else if(maze[newX][newY]==0){
            return false;
        }
        // already visited vala case 
        else if(visited[newX][newY] ){
            return false;
        }
        // koi case meet na kare to return true kar do 
        // iska matlab app allow ho 
        else{
            return true;
        }
    }
    // solve function defination 
    static void solve(
        int maze[][],
        int srcX,
        int srcY,
        int desX,
        int desY,
        boolean visited[][],
        ArrayList<String>ans,
        String path
        
        ){
            // base case 
            if(srcX==desX && srcY == desY){
                // iska matlab sab lans tak pauch cuke he 
                ans.add(path);
                return;
            }
            int n = maze.length;
            visited[srcX][srcY] = true;
            
            // up
            // un bound bala case 
            int newX = srcX-1;
            int newY = srcY;
            
            if(isPossibleToMove(newX,newY,n,maze,visited)){
                // to app ja stakte ho 
                // baki recursion sambhal lega
                solve(maze,newX,newY,desX,desY,visited,ans,path + "U");
              
            }
            // down
            newX = srcX +1;
            newY= srcY;
            if(isPossibleToMove(newX ,newY,n,maze,visited)){
                // you should have to go 
                solve(maze,newX,newY,desX,desY,visited,ans,path + "D");
            }
            //left
            newX = srcX;
            newY = srcY -1;
            if(isPossibleToMove(newX, newY,n,maze,visited)){
                solve(maze,newX,newY,desX, desY, visited, ans , path+ "L");
                
            }
            // right
            newX= srcX;
            newY = srcY + 1;
            // you have to go 
            if(isPossibleToMove(newX,newY,n, maze,visited)){
                   solve(maze,newX,newY,desX, desY, visited, ans , path+ "R");
                
            }
            
            // after traverse all path 
            // this is backTracking bala step 
            visited[srcX][srcY] = false;
            
            
            
        }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        int srcX =0;
        int srcY = 0;
        int desX = n-1;
        int desY = n-1;
        String path = "";
        boolean visited [][] = new boolean[n][n];
        
        // if src ki location blocked cell and dest cell is bloced cell ho 
        if(maze[0][0] ==0 || maze[n-1][n-1]==0){
            return ans;
        }
        
        solve(maze,srcX,srcY,desX,desY,visited,ans,path);
        Collections.sort(ans);
        return ans;
        
        
    }
}