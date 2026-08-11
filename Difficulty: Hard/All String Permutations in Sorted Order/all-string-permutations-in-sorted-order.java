class Solution {
    static void solve(String s, String output, ArrayList<String> ans){
        // base case 
        // ager remain string input string empty he 
        // iska matlab ouput ready he 
        
        if(s.isEmpty()){
            ans.add(output);
            return;
        }
        
        // ager iska nahi he to her character ko try kao 
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            String remString =s.substring(0,i) + s.substring(i+1);
            
            // recursive call 
            solve(remString, output + ch , ans);
        }
    }
    public ArrayList<String> permutation(String s) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
 
        
        solve(s,"",ans);
        Collections.sort(ans);
        return ans;
    }
}