package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
<<<<<<< HEAD
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
=======
    public SimpleFunctions() {

        public static int [] task4(int [] a, int [] b){
            if (a.length != b.length){
                return null;
            }
            else{
                int [] answer = new int[a.length];

                for(int i = 0; i < a.length; i++){
                    answer[i] = a[i] + b[a.length - 1- i];
                    }
                    return answer;
                }
>>>>>>> g21H8394.Task4
        }
        return roundedNumbers;
    }
}
