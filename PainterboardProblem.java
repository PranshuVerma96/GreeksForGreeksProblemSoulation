class Solution {
    // defination fo isValidSoultion Function 
    
    static boolean isValidSolution(int arr[], int k , int maxLength){
        int printerCount = 1;
        int printedLength = 0;
        
        // find the total 
        
        for(int i = 0; i < arr.length; i++){
            if((printedLength + arr[i]) <= maxLength){
                // assign board to painter
                
                printedLength = printedLength + arr[i];
            }
            
            else {
                // printedLength + arr[i] > maxlength
                // limit breach 
                
                printerCount++;
                printedLength = 0;
                
                if(printerCount >k || arr[i] > maxLength){
                    return false;
                }
                else{
                    // kisi me koi dekat nahi he
                    printedLength = printedLength + arr[i];
                }
                
            }
        }
        // ager yaha tak a gaye ho to sab sahi 
        return true;
    }
    
    public int minTime(int[] arr, int k) {
        
        int sum = 0;
        
        // loop for  find sum 
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        
        // after that assign 
        
        int start = 0;
        int end = sum;
        int ans = -1;
        
        // check using loop
        
        while(start<= end){
            
            int mid = start + (end -start)/2;
            if(isValidSolution(arr,k,mid)){
                ans = mid;
                // move to left 
                end = mid -1;
                
            }
            else{
                // not valid check than check in the left 
                // move to right 
                start = mid + 1;
            }
        }
        return ans;
    }
}
