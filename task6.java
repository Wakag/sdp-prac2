import java.util.ArrayList;
import java.util.List;

public class Task6 {
    
    public static List<Integer> roundUpToNextHundred(List<Integer> numbers) {
        // Create a new list to hold the rounded values
        List<Integer> roundedNumbers = new ArrayList<>();
        
        // Iterate over each number in the provided list
        for (Integer number : numbers) {
            // If the number is already a multiple of 100, leave it unchanged
            if (number % 100 == 0) {
                roundedNumbers.add(number);
            } else {
                // Round up to the next-highest multiple of 100
                int rounded = ((number / 100) + 1) * 100;
                roundedNumbers.add(rounded);
            }
        }
        
        // Return the new list with rounded values
        return roundedNumbers;
    }
}
