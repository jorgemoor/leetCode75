package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DecodeString {

    public static String decodeString(String s) {
        Deque<Integer> counts = new ArrayDeque<>();
        Deque<StringBuilder> strings = new ArrayDeque<>();

        StringBuilder current = new StringBuilder();
        int number = 0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                number = number * 10 + (c - '0');
            }else if(c == '['){
                counts.push(number);
                strings.push(current);
                current = new StringBuilder();
                number = 0;
            }else if(c == ']'){
                int repeat = counts.pop();
                StringBuilder previous = strings.pop();

                while(repeat-- > 0){
                    previous.append(current);
                }
                current = previous;
            }else{
                current.append(c);
            }
        }
        return current.toString();
    }


}
