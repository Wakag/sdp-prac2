package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    
    // Constructor
    public SimpleFunctions() {}
    public static int sumElements(List<Integer> a, List<Integer> b) {
        int total = 0;
        for (int index : b) {
            if (index >= 0 && index < a.size()) {
                total += a.get(index);
            }
        }
        return total;
    }
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
