public class FindAElementInAnearlySortedArray {
    static int findElementNearlySortedArray(int arr[] , int target){
        int start = 0;
        int n = arr.length;
        int end = n-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target ){
                return mid;
            }
            if (mid-1 >=0 && arr[mid - 1] ==target) {
                return mid -1;
            }
            if(mid + 1<n && arr[mid + 1] == target) {
                return mid + 1;
            }
            if(target > arr[mid]){
                // move to right
                start = mid + 2;
            }
            else{
                // move to left
                end = mid -2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3,5,10,9,11};
        int k = 1;
        int result = findElementNearlySortedArray(arr , k);
        System.out.println("the answer is == " + result);
    }
}
