class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // we are in the increasing part of mountain
                left = mid + 1;
            } else {
                // we are in the decreasing part of mountain
                right = mid;
            }
        }

        // left == right, peak index
        return left;
    }
}
