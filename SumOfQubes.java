class Solution {
    int sumOfSeries(int n) {
        // code here
        if(n==0 ){
            return 0;
        }
        int sum =0;
        while(n >0){
            
           int  total = n*n*n;
            sum += total;
            n--;
        }
        return sum;
    }
}
