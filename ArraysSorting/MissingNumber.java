package ArraysSorting;

import java.util.Arrays;

//Find the missing number containg 0 to n
public class MissingNumber {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example array
        int n = 6; // The number of elements should be from 0 to n
        
        int missingNumber = findMissingNumber(arr, n);
        int missingNumberXOR = findMissingNumberXOR(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }

    private static int findMissingNumber(int[] arr, int n) {
        //sum of first n natural numbers
        int expectedSum = n * (n + 1) / 2;
        //sum of elements in the array
        int actualSum = Arrays.stream(arr).sum();
        //The missing number is the difference between expected sum and actual sum
        return expectedSum - actualSum;
    }

    // Approach 2 using XOR
    private static int findMissingNumberXOR(int[] arr, int n) {
        int xor = 0;
        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }
        // XOR all elements in the array
        for (int num : arr) {
            xor ^= num;
        }
        // The result will be the missing number
        return xor;
    }
}
