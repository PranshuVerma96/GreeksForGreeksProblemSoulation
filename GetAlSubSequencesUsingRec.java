class Solution {
          // function get all subsequences 
        static void getAllSubSequences(String s, int index, StringBuilder output,List<String>ans){
            // base case 
            
            if(index >= s.length()){
                // sub seqences ready he 
                String subSequences = output.toString();
                ans.add(subSequences);
                return;
            }
            // 1 case solve karna he 
            char ch = s.charAt(index);
            // include 
            output.append(ch);
            getAllSubSequences(s,index+1,output,ans);
            
            // exclude
            output.deleteCharAt(output.length()-1);
           getAllSubSequences(s,index+1,output,ans);
            
        }
    public List<String> powerSet(String s) {
        
  
        // Code here
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        
        int index = 0;
       getAllSubSequences(s,index,output,ans);
        Collections.sort(ans);
        return ans;
    }
}
