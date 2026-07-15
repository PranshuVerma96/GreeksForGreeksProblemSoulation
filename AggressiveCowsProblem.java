import java.util.Arrays;

public class AggressiveCowsProblem {

    static boolean isValidAnswer(int arr[], int k , int minDistance){
        //brute force

        int cowCount = 1;
        // first cows place on zero index
        int lastPosition = 0;

        for(int i=1; i<arr.length; i++){
            // currentCow ko current postion tabi ayegi jab current and preivos cosw ka distance minmadistance ke baraber ho

            if(arr[i] - arr[lastPosition] >=minDistance){
                // can place savly
                cowCount++;
                // new place ho chuki he
                // is ka matlab last postion ko update kaor
                lastPosition = i;

                if(cowCount == k){
                    // app sab cow place kar cuke he
                    return true;
                }
            }
        }
        return false;
    }
    static int aggressiveCows(int arr[] , int k){
        Arrays.sort(arr);
        int n = arr.length;

        int ans = -1;
        int start =0; // minDistance
        int end = arr[n-1] - arr[0]; // maxDistance

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (isValidAnswer(arr, k, mid)) {
                // possible solution
                // store ans
                // move to right
                ans = mid;

                start = mid + 1;
            } else {
                // mid k sath there is no possible solution
                //move to left
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,8,4,9};
        int k = 3;

        int result = aggressiveCows(arr , k);
        System.out.println("the answer :" + result);
    }
}
