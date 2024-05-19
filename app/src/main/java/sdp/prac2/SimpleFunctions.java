package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    
    // Constructor
    public SimpleFunctions() {}
    
    /**
     * Sums elements of list 'a' at positions specified in list 'b'.
     * @param a List of integers.
     * @param b List of indices.
     * @return Sum of elements in 'a' at indices specified in 'b'.
     */
    public static int sumElements(List<Integer> a, List<Integer> b) {
        int total = 0;
        for (int index : b) {
            if (index >= 0 && index < a.size()) {
                total += a.get(index);
            }
        }
        return total;
    }
    
    /**
     * Removes the first character from each string in the list.
     * @param list List of strings.
     * @return A new list with each string having its first character removed.
     */
    public static List<String> Task2(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            if (str.length() > 1) {
                result.add(str.substring(1));  // Remove the first character
            }
            // Skip strings of length 0 or 1
        }
        return result;
    }

    /**
     * Checks if the parentheses in the input string are balanced.
     * @param input Input string containing parentheses.
     * @return True if parentheses are balanced, false otherwise.
     */
    public static boolean task3(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
