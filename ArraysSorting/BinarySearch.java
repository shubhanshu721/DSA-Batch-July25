package ArraysSorting;

//Binary Search is a search algorithm that finds the position of a target value within a sorted array.
//We need to opt for divide and conquer approach to implement binary search.
//First take out the middle element of the array and compare it with the target value.

public class BinarySearch {

    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearch(arr, 9)); // Target not found
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while(start<=end) {
            int mid = (start+end)/2;
            if (target < arr[mid]) {
                end = mid-1;
            } else if (target == arr[mid]) {
                return mid; // Target found
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearchRec(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        return binarySearchUsingRecursion(arr, start, end, target);
    }

    private static int binarySearchUsingRecursion(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1; // Target not found
        }
        int mid = start + (end - start) / 2; // To avoid overflow
        if (arr[mid] == target) {
            return mid; // Target found
        }

        if (target < arr[mid]) {
            return  binarySearchUsingRecursion(arr, start, mid-1, target);
        }

        return binarySearchUsingRecursion(arr, mid+1, end, target);
    }
}
