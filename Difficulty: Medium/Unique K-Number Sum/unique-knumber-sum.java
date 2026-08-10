class Solution {
    static void solve(
        int arr[],
        int target,
        int index,
        int count,
        int k, 
        ArrayList<ArrayList<Integer>> ans,
        ArrayList<Integer> output
        ){
            // base case 
            if(count== k && target == 0){
                // iska matlab combo ready he
                ans.add(new ArrayList(output));
                return;
            }
            if(index >= arr.length){
                return ;
            }
            if(target < 0){
                return ;
            }
            
            int currentElement = arr[index];
            // ab hum exclude and include bala pattern follw karege 
            output.add(currentElement);
            
            // include bali call 
            solve(arr, target-currentElement, index+1, count+1, k, ans, output);
            
            // ab back bai call 
            output.remove(output.size()-1);
            
            // ab exclude balid call 
            solve(arr, target, index+1, count, k, ans, output);
        }
        
    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target =n;
        int count =0;
        int index =0;
        
        solve(arr, target, index, count,k, ans, output);
        return ans;
    }
}