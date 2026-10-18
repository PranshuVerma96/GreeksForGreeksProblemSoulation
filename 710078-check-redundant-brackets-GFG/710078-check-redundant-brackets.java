class Solution {
    public boolean checkRedundancy(String s) {
        // code here
        // sab se pahle is deque se implement kar lete he 
        Deque<Character> st = new ArrayDeque<>();
        
        // traver karna padega 
        for(char ch : s.toCharArray()){
            // check karo empty to nahi he 
     
             if(ch == '(' || ch =='+' ||ch == '-' || ch == '/' || ch =='*'){
                st.push(ch);
            }
            else if(ch == ')'){
                // jab tak mughj is stack me is ka closing nahi mila 
                // tab tak me stack me pop karuge
                // and track karuga koi operator bola ya nahi 
                boolean operatorFound = false;
                
                while(!st.isEmpty()){
                    char temp = st.peek();
                    if(temp == '+' || temp == '-' || temp == '/' || temp == '*'){
                        operatorFound = true;
                    }
                    if( temp == '('){
                        st.pop();
                        break;
                    }
                     st.pop();
                }
               if(!operatorFound){
                   return true;
               }
        }
            }
              // ya tak ana mtlab redundent bracket nahi mile return false
        return false;
       
        }
      
       
        
    
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna