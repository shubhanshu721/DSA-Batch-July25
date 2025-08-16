package ArraysSorting;

/**
 * This class contains a solution to find the majority element in an array.
 * A majority element is an element that appears more than n/2 times in the array,
 * where n is the size of the array.
 *
 * The solution uses the Boyer-Moore Voting Algorithm to determine the majority element
 * in O(n) time complexity and O(1) space complexity.
 * If no majority element exists, the method returns -1.*/
public class MejorityElement {

    public static void main(String[] args) {
        int[] nums = {8,5,8,2,5,5,5,5,5,5,5,5,5,5,5,5,5};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        int candidate = 0, vote = 0;
        for (int i : nums) {
            if (vote == 0) {
                candidate = i;
                vote++;
            } else {
                if (i == candidate) vote++;
                else vote--;
            }
        }

        int count = 0;
        for (int num : nums) {
            if (num == candidate) count++;
        }

        if (count > nums.length / 2) return candidate;
        return -1;
    }
//    private static int majorityElement(int[] nums) {
//        int candidate = 0, vote = 0;
//        for (int i : nums) {
//            if (candidate==0) {
//                candidate = i ;
//                vote++;
//            }else {
//                if (i == candidate) vote++;
//                else vote--;
//            }
//        }
//
//        int count = 0;
//        for (int cnad : nums) {
//            if (cnad == candidate) count++;
//        }
//
//        if (count > nums.length/2) return candidate;
//        return -1;
//    }
}
