package sdp.warmup;
import java.util.ArrayList;
import java.util.List;

public class SimpleFunctions {

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
}
