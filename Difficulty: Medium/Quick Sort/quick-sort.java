class Solution {
	public void quickSort(int[] arr, int low, int high) {
		// code here
		int s = low;
		int e = high;
		
		// base case
		if (s >= e) {
			return;
		}
		int pivotIndex = partition(arr, s, e);
		
		// left bale part ko recurion ko do
		quickSort(arr, s, pivotIndex - 1);
		
		// right bale part ki recursion ko do
		quickSort(arr, pivotIndex + 1, e);
	}
	
	private int partition(int[] arr, int low, int high) {
		// code here
		int s = low;
		int e = high;
		
		int pivotElement = arr[s];
		
		// we are follow count based partion
		int count = 0;
		for (int i = s + 1; i <= e; i++) {
			if (arr[i] <= pivotElement) {
				count ++;
			}
			
		}
		int correctPosition = count + s;
		
		// after that swap
		int temp = arr[correctPosition];
		arr[correctPosition] = arr[s];
		arr[s] = temp;
		
		int i = s;
		int j = e;
		
		while (i<correctPosition && j>correctPosition) {
			while (arr[i] <= pivotElement) {
				i++;
			}
			
			while (arr[j] > pivotElement) {
				j--;
			}
			
			if (i<correctPosition && j> correctPosition) {
				// ab swap kar do
				int temp2 = arr[i];
				arr[i] = arr[j];
				arr[j] = temp2;
				i++;
				j--;
			}
			
		}
		return correctPosition;
	}
}
