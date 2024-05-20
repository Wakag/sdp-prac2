package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
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
        }
    }
}
