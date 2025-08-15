package ArraysSorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MissingMutiple {

    public static void main (String[] args) {
        List<Integer> missingNumbers = missingNumbers(new ArrayList<>(List.of(203, 204, 205, 206, 207, 208, 203, 204, 205, 206)),
                                                     new ArrayList<>(List.of(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204)));
        System.out.println(missingNumbers.toString());

    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        Stack<Integer> stack = new Stack<>();
        arr.sort(Integer::compareTo);
        brr.sort(Integer::compareTo);
        for (int num : brr) {
            if (arr.contains(num) && !stack.empty()){
                stack.pop();
            }
            stack.push(num);
        }
        return stack.stream().distinct().toList();
    }
}
