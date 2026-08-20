class Solution {
    static int merge(int arr[],int s, int e, int mid){
        // first of all calculate the array left 
        int leftArrLen = mid-s+1;
        int rightArrLen = e -mid;
        
        // now the tern is to create two array 
        int leftArr[] = new int[leftArrLen];
        int rightArr[] =  new int[rightArrLen];
        
        // copying the element into left and right array 
        int k = s;
        for(int i=0; i<leftArrLen; i++){
            leftArr[i] = arr[k];
        
            k++;
        }
        
        // copy right array element 
        k = mid+1;
        for(int i=0; i<rightArrLen; i++){
            rightArr[i] =  arr[k];
           
            k++;
        }
        
        // now the main logic of merge 
        int i =0;
        int j =0; 
        k = s;
        int invCount =0;
        while(i<leftArrLen && j<rightArrLen){
            if(leftArr[i] <= rightArr[j]){
                arr[k] =  leftArr[i];
                i++;
                k++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
                k++;
                
                // inversion ka logic
                invCount = invCount + (leftArrLen - i);
            }
        }
        // after that copy all remaining element 
        while(i<leftArrLen){
            arr[k] =  leftArr[i];
                i++;
                k++;
        }
        while(j<rightArrLen){
            arr[k] = rightArr[j];
            j++;
            k++;
            
           
        }
        // return ans ;
        return invCount;
        
    }
    static int mergeSort(int arr[],int s,int e){
        // base case 
        if(s>=e){
            return 0;
        }
        
        // we have to go divide array 
        int mid = s + (e-s)/2;
        // left array sort by recursion 
        int leftInversion = mergeSort(arr,s,mid);
        // right array sort by recursion 
        int rightInversion = mergeSort(arr,mid+1,e);
        
        // there is merge fuction there we have to need to called this fuction 
        int intermediateInversion = merge(arr,s,e,mid);
        int inversionCount = leftInversion + rightInversion + intermediateInversion ;
        
        return inversionCount;
    }
    public int inversionCount(int arr[]) {
        // code here
        int s = 0; 
        int e = arr.length-1;
        int ans = mergeSort(arr,s,e);
        return ans;
    }
}