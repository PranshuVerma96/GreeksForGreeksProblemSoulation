class Solution {
    static void merge(int arr[] ,  int start,int end, int mid){
        // first of all we are not use the inpace sorting techinque
        int leftArrayLen = mid - start+1;
        int rightArrayLen = end - mid;
        
        // after that create two arrays 
        int leftArray[] = new int[leftArrayLen];
        int rightArray[] = new int[rightArrayLen];
        
        // first sort left array
        int k = start;
        for(int i=0; i<leftArrayLen; i++){
           leftArray[i] = arr[k];
            k++;
        }
        
        // after that sort right part 
        k = mid + 1;
        for(int i=0; i<rightArrayLen; i++){
           rightArray[i] = arr[k];
            k++;
        }
        
        // now is tern of merge both sorted array
        k =start;
        int i=0;
        int j = 0;
        
        while(i <leftArrayLen && j<rightArrayLen){
            if(leftArray[i] < rightArray[j]){
                arr[k] = leftArray[i];
                i++;
                k++;
            }
            else{
             arr[k] = rightArray[j];
                j++;
                k++;
            }
        }
        // after if left array fully consumed and right array element ment remain 
        // than you have to go for paste rem element
        while(i<leftArrayLen){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        // after if right array  fully consumed and left array element remain 
        // then pasete remain element as same 
        while(j<rightArrayLen){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public void mergeSort(int arr[], int l, int r) {
        // code here
        int start = l;
        int end = r;
        
        // base case 
        if(start >= end){
            return;
        }
        int mid = start + (end -start)/2;
        // solve using recursion 
        // sort left array
        mergeSort(arr,start,mid);
        
        // sort right array
        mergeSort(arr,mid+1,end);
        
        // after that sort both array 
        merge(arr,start,end,mid);
    }
}