/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class AppTest {

     //Task 1 tests
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

     
    // Task 2 tests

    @Test void testTask2_NormalCase() {
        List<String> input = Arrays.asList("hello", "world", "java");
        List<String> expected = Arrays.asList("ello", "orld", "ava");
        List<String> result = SimpleFunctions.task2(input);
        assertEquals(expected, result);
    }

    @Test void testTask2_EmptyList() {
        List<String> input = Collections.emptyList();
        List<String> expected = Collections.emptyList();
        List<String> result = SimpleFunctions.task2(input);
        assertEquals(expected, result);
    }

    @Test void testTask2_SingleCharacterStrings() {
        List<String> input = Arrays.asList("a", "b", "c");
        List<String> expected = Collections.emptyList();
        List<String> result = SimpleFunctions.task2(input);
        assertEquals(expected, result);
    }

    @Test void testTask2_MixedLengthStrings() {
        List<String> input = Arrays.asList("a", "ab", "abc", "abcd");
        List<String> expected = Arrays.asList("b", "bc", "bcd");
        List<String> result = SimpleFunctions.task2(input);
        assertEquals(expected, result);
    }

    @Test void testTask2_StringsContainingSpaces() {
        List<String> input = Arrays.asList("a ", " ab", "abc ");
        List<String> expected = Arrays.asList(" ", "ab", "bc ");
        List<String> result = SimpleFunctions.task2(input);
        assertEquals(expected, result);
    }

    @Test void testTask2_EmptyStrings() {
        List<String> input = Arrays.asList("", "a", "ab", "", "abc");
        List<String> expected = Arrays.asList("b", "bc");
        List<String> result = SimpleFunctions.task2(input);
        assertEquals(expected, result);
    }


  //Task 4 tests

  @Test
    public void testTask4() {
        int[] a = {7, 8, 6};
        int[] b = {2, 1, 5};

        int[] result = SimpleFunctions.task4(a, b);
        List<Integer> expectedResult = Arrays.asList(35, 8, 12); // 7x5, 8x1, 6x2

        // Convert the result array to a List for easy comparison
        List<Integer> resultList = Arrays.asList(result[0], result[1], result[2]);

        assertEquals(expectedResult, resultList);
    }

    @Test void testTask4DifferentLength() { //tests task4 for different length lists
        // Test case 2
        //Arrange
        int[] a = {7, 8, 6,8};
        int[] b = {2, 1, 5};
        
        List<Integer> expectedResult = null ;
        //Act
        int [] actualResult = SimpleFunctions.task4(a, b);
        //Assert
        assertEquals(expectedResult, actualResult);
    } 

    //Task 5 tests
    @Test void testTask5True() { //tests for task 5 expecting a sorted list
        // Test case 1
        //Arrange
        int [] lst = {1,2,3,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        boolean expectedResult = true;
        //Act
        boolean actualResult = SimpleFunctions.task5(lst);
        //Assert
        assertEquals(expectedResult, actualResult);
    }   

    @Test void testTask5False() { //test for task 5 expecting a unsorted list
        // Test case 2
        //Arrange
        int [] lst = {83, 12, 47, 5, 67, 29, 54, 91, 38, 22, 76, 8, 43, 65, 31, 97, 18, 71, 52, 34, 6, 85, 26, 93, 49, 11, 58, 32, 79, 14, 66, 25, 89, 37, 10, 73, 53, 20, 81, 45, 3, 90, 15, 61, 27, 99, 39, 7, 74, 55};
        boolean expectedResult = false;
        //Act
        boolean actualResult = SimpleFunctions.task5(lst);
        //Assert
        assertEquals(expectedResult, actualResult);
    }   
}
