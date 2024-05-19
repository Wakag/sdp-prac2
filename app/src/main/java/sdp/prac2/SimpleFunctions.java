package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    
public static int sumElements(List<Integer> a, List<Integer> b) {
    int total = 0; 
    for ( int index : b){
        if (index >= 0 && index < a.size()){
            total += a.get(index);
        }
    }
    return total; 
}
public static boolean task3(String input) { //matching brackets
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()){
            if (ch == '(') {
                stack.push(ch);
            }

            else if (ch == ')') {
                if (stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty() ;

    }    
    

}
