class Solution {
    
    // this is a brute fore method to check out the height 
     static boolean isValidAnswer(int arr[], int maxHeight , int m){
         long totalWood = 0;
         
         // count remain wood and store 
         for(int i=0; i<arr.length; i++){
             if(arr[i] > maxHeight ){
                 long currentHeight = arr[i] - maxHeight;
                 totalWood += currentHeight;
             }
         }
             if(totalWood >=m){
                 return true;
             }
             else {
                 return false;
             }
         }
     
     
      int maxHeight(int[] arr, int m) {
      
      int n = arr.length;
      int start = 0; // start from 0 
      int maxHeight = -1;
      int ans = -1;
      // calculate the max 
      for(int i=0; i<arr.length; i++){
          if(arr[i] > maxHeight){
              maxHeight = arr[i];
          }
      }
      
      int end = maxHeight; // this is to calcuate to find the max height are in the treess 
      
      // check using binary search 
      
      while(start <= end){
          int mid = start + (end -start)/2;
          
         // after calculate mid check 
         
        if(isValidAnswer(arr, mid,m)){
            ans = mid;
            // and move to right 
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
        
       
    }
     return ans;
    
      }   
}
