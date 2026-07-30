class Solution {
    public String removePair(String s) {
        // code here
        StringBuilder ans = new StringBuilder();
        
        // first of all iterate the loop
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
           
            if(ans.length()>0 && ans.charAt(ans.length()-1) == ch){
                // delete the element 
                ans.deleteCharAt(ans.length()-1);
               
               
            }
          
            else {
                // append this folling character 
                ans.append(ch);
            }
            
        }
        
        if(ans.length() ==0){
                return "-1";
            }
            
        return ans.toString();
    }
}
