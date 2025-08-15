package ArraysSorting;

//find the repeated number in an array from 0 to n
//using XOR approach
//If we will do XOR with 0 it will return the same number
public class FindRepeatedNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2,3, 4, 5, 6, 6}; // Example array
        System.out.println(findRepeatedNumber(arr));
}

    private static int findRepeatedNumber(int[] arr) {
        int xor = 0;
        // XOR all numbers from 0 to n
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        // XOR all elements in the array
        for (int i = 1; i <= arr.length - 1; i++) {
            xor ^= i;
        }
        // The result will be the repeated number
        return xor;

    }
    }
