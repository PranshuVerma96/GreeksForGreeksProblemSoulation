class Solution {
    static void solve(
        int arr[],
        int target,
        int index,
        ArrayList<ArrayList<Integer>> ans,
        ArrayList<Integer> output
        ){
            // base case 
            // jab target 0 ke barabar ho jaye 
            if(target ==0){
                // iska matlab sab combo ready he 
                ans.add(new ArrayList(output));
                return;
            }
            
            // jab index array ke size se bad ho jaye 
            if(index >= arr.length){
                return;
            }
            if(target < 0){
                return ;
            }
            
            // ab hum include and exclude pattaern follow karege 
            int currentElement = arr[index];
            output.add(currentElement);
            
            // include call 
            // isk bar koi dupclicate element na ho 
            
            solve(arr, target-currentElement, index+1, ans, output);
            
            // backtrack bal step 
            output.remove(output.size()-1);
            
            // excude bale patter se pile hum check karege ko koi duplicate campo to nahi he
            while(index+1 < arr.length && arr[index] == arr[index+1]){
                index++;
            }
            
            // ab eclude bali call 
            solve(arr, target,index+1 , ans, output);
        }
    public ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        
        Arrays.sort(arr);
        int index = 0;
        
        solve(arr, target, index, ans , output);
        return ans;
    }
}
