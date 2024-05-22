package sdp.prac2;

import java.util.*;

public class SimpleFunctions {

    public SimpleFunctions() {}
    public static List<Integer> Task6(List<Integer> numbers) {
        List<Integer> roundedNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 100 == 0) {
                roundedNumbers.add(number);
            } else {
                int roundedNumber = ((number / 100) + 1) * 100;
                roundedNumbers.add(roundedNumber);
            }
        }
        return roundedNumbers;
    }

    public static int [] task4(int [] a, int [] b){
        if (a.length != b.length){
            return null;
        } else {
            int [] answer = new int[a.length];

            for(int i = 0; i < a.length; i++){
                answer[i] = a[i] * b[a.length - 1- i];
            }
                return answer;
            }
        }
        public static boolean Task5(int[] array) {  //is Sorted 
            // Base cases: empty array or a single-element array are considered sorted
            if (array == null || array.length <= 1) {
                return true;
            }
    
            // Iterate through the array and check if each element is less than or equal to the next
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false; //if not sorted
                }
            }
    
            return true;// if sorted
        }
    
}
