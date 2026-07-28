// this is the brute fore method and we can do this optimize using binary search becasue the array is sorted.
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
     
        int count = 0;
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
