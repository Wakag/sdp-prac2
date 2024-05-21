/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
     @Test
    public void testTask1() {
        // Test case 1: Valid indexes in range
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(0, 1, 2);
        int expectedSum = 6; // 1 + 2 + 3 = 6
        int actualSum = SimpleFunctions.sumElements(a, b);
        assertEquals(expectedSum, actualSum);

        // Test case 2: Negative index and out-of-range index
        a = Arrays.asList(1, 2, 3);
        b = Arrays.asList(0, 1, -1, 3);
        expectedSum = 3; // 1 + 2 = 3 (index 3 is out of range)
        actualSum = SimpleFunctions.sumElements(a, b);
        assertEquals(expectedSum, actualSum);

        // Test case 3: Index out of range
        a = Arrays.asList(1, 2, 3);
        b = Arrays.asList(3);
        expectedSum = 0; // Index 3 is out of range
        actualSum = SimpleFunctions.sumElements(a, b);
        assertEquals(expectedSum, actualSum);

        // Test case 4: Empty index list
        a = Arrays.asList(1, 2, 3);
        b = Arrays.asList();
        expectedSum = 0; // Empty index list
        actualSum = SimpleFunctions.sumElements(a, b);
        assertEquals(expectedSum, actualSum);

        // Test case 5: Empty list 'a'
        a = Arrays.asList();
        b = Arrays.asList(0);
        expectedSum = 0; // Empty list 'a'
        actualSum = SimpleFunctions.sumElements(a, b);
        assertEquals(expectedSum, actualSum);
    }
     
  @Test void testTask4EqualLength() { //tests task4 for equal length lists
        // Test case 1
        //Arrange
        List<Integer> a = Arrays.asList(7, 8, 6);
        List<Integer> b = Arrays.asList(2, 1, 5);
        List<Integer> expectedResult = [35, 8, 12] ; //7x5 ,8x1, 6x2
        //Act
        List<Integer> actualSum = SimpleFunctions.task4(a, b);
        //Assert
        assertEquals(expectedSum, actualSum);
    }

    @Test void testTask4DifferentLength() { //tests task4 for different length lists
        // Test case 2
        //Arrange
        List<Integer> a = Arrays.asList(7, 8, 6, 8);
        List<Integer> b = Arrays.asList(2, 1, 5);
        List<Integer> expectedResult = null ;
        //Act
        List<Integer> actualSum = SimpleFunctions.task4(a, b);
        //Assert
        assertEquals(expectedSum, actualSum);
    }   
}
