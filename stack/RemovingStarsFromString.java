package stack;

import java.util.Stack;

public class RemovingStarsFromString {
    public static String removeStars(String s){
        char[] arr = s.toCharArray();
        int w = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '*'){
                w--;
            }else{
                arr[w]  = arr[i];
                w++;
            }
        }
        return new String(arr, 0, w);
    }
}
