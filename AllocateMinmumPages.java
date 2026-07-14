class Solution {

    static boolean isValidAnswer(int[] arr, int k, long maxPages) {

        int students = 1;
        long pages = 0;

        for (int i = 0; i < arr.length; i++) {

            if (pages + arr[i] <= maxPages) {
                pages += arr[i];
            } else {

                students++;

                if (students > k || arr[i] > maxPages) {
                    return false;
                }

                pages = arr[i];
            }
        }

        return true;
    }

    public int findPages(int[] arr, int k) {

        if (arr.length < k) {
            return -1;
        }

        long start = 0;
        long end = 0;

        for (int pages : arr) {
            start = Math.max(start, (long) pages);
            end += pages;
        }

        long ans = end;

        while (start <= end) {

            long mid = start + (end - start) / 2;

            if (isValidAnswer(arr, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (int) ans;
    }
}
