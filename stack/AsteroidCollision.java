package stack;

import java.util.Arrays;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids){
        int[] stack  = new int[asteroids.length];
        int top = 0;

        for(int i : asteroids){
            if(top == 0 || i>0) stack[top++] = i;
            else{
                boolean explode = false;
                while(top > 0 && stack[top-1] > 0){
                    if(stack[top-1]>Math.abs(i)){
                        explode = true;
                        break;
                    } else if(stack[top-1] < Math.abs(i)) {
                        top--;
                    }else{
                        explode = true;
                        top--;
                        break;
                    }

                }
                if(!explode) stack[top++] = i;
            }
        }
        int[] result = new int[top];
        for(int i = 0; i < top; i++){
            result[i] = stack[i];
        }
        return result;
    }
}
