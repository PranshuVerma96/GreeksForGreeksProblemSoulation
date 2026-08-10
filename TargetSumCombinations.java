class Solution {
    
    // defintion of solve function 
    static void solve(
        int arr[],
        int target,
        int index,
        ArrayList<ArrayList<Integer>> ans,
        ArrayList<Integer> output  ){
       
            
            // base case 
            if(target == 0){
                // iska matlab sab soulation ready he 
                ans.add(new ArrayList(output));
                return ;
            }
            
            // index array ki length ke bhar jala gaye 
            if(index >= arr.length){
                return;
            }
            
            // if target 0 se chota ho 
            if(target <0){
                return ;
            }
            
            // ab hum include and exclude pattern follow karege 
            int currentElement = arr[index];
            output.add(currentElement);
            
            solve(arr, target- currentElement, index, ans, output);
            
            // going to exlude pattern 
            // use backtracking
            output.remove(output.size()-1);
            
            // ab exclude bali call mardo 
            solve(arr, target, index+1, ans, output);
            
        }
        
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        
        int index = 0;
        
        solve(arr, target, index, ans, output);
        return ans;
        
    }
}
