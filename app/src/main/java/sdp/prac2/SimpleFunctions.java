package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
        public static int sumElements(List<Integer> a, List<Integer> b) {
            int total = 0; 
            for ( int index : b){
                if (index >= 0 && index < a.size()){
                    total += a.get(index);
                }
            }
            return total; 
     }
    }
}
