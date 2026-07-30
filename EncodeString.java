class Solution {
    public static String encode(String s) {
        // code here
       StringBuilder ans = new StringBuilder();
       int i=0;
       while(i<s.length()){
           char currentChar = s.charAt(i);
           int count = 1;
           
           // count same consectuive characters
           while(i+1 <s.length() && s.charAt(i) == s.charAt(i+1)){
               i++;
               count ++;
           }
           // add character and its count
           ans.append(currentChar);
           ans.append(count);
           
           // Move to next new character
           
           i++;
       }
       return ans.toString();
    }
}
