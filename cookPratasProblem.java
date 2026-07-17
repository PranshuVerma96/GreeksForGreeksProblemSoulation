public class RotiPrataProblem {
    static boolean isValidAnswer(int cook[] , int totalPratas ,  int totalCooks,int timeLimit){
        int prataCount = 0;
        // ek ek kar ke her cook ke pas
        for(int i=0; i<cook.length; i++){
            int currentCookRank = cook[i];
            int timtTaken = 0;
            int j =1;

            //currentCook = r
            // 1r , 2r , 3r, 4r
            // cook karna start karo

            while (timtTaken <= timeLimit) {
                if (timtTaken + j * currentCookRank <= timeLimit) {
                    // ye pata bana saktahu
                    timtTaken = timtTaken + j*currentCookRank;
                    prataCount++;
                    j++;
                } else {
                    // ska matlab karen parata time limit me nahi banta
                    break;

                }
            }
                // jab ye loop end to tah parata add karsatahe
                if(prataCount >= totalPratas){
                    return true;
                }

            }
            if(prataCount >= totalPratas){
                return true;
            }
            return false;

    }
    static int minTimeToCookPratas(int p, int [] cook, int n){
        // p = number of pratas
        // n = number of cooks
        int maxRank = -1;
        for(int i=0; i<cook.length; i++){
            if(cook[i] > maxRank){
                maxRank = cook[i];
            }
        }
        int start = 0;
        int ans = -1;
        // r *(n*(n+1)/2) r= maxRank and n = number of pratas
        int end = maxRank * (p * (p + 1)/2);

        while (start <= end){
            int mid = start + (end - start)/2;

            if(isValidAnswer(cook,p,n,mid)){
                // store ans
                ans = mid;
                // move to left
                end = mid -1;
            }
            else {
                // move to right
                start = mid +1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int p =10;
        int n= 4;
        int result = minTimeToCookPratas(p, arr,n);
        System.out.println(result);
    }
}
