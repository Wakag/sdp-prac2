package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {

        public addList(int [] a, int [] b){
            if (a.length != b.length){
                return NULL;
            }
            else{
                int [] answer = new int[a.length];

                for(int i = 0; i < a.length; i++){
                    for(int j = b.length - 1; j >= 0; j--){
                        answer[i] = a[i] + b[j];
                    }
                    return answer;
                }
            }
        }
    }
}
