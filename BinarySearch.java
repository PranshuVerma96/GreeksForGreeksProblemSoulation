class Solution {
    
    public boolean binarySearch(int[] arr, int k) {
      int s =0;
      int end = arr.length-1;
      
      // loop 
      while(s <= end){
          int mid = s + (end - s)/2;
          
          if(arr[mid] == k){
              return true;
          }
          else if(arr[mid] > k){
              // move to left 
              end = mid -1;
          }
          else {
              // move to right 
              s = mid + 1;
          }
      }
      return false;
        
    }
}
