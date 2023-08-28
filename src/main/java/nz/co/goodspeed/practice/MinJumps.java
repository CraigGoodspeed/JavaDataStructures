package nz.co.goodspeed.practice;

import java.util.Arrays;

public class MinJumps {

    public static void main(String[] args) {
        //System.out.println(minJumps(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
        System.out.println(minJumps(new int[]{2, 3, 1, 1, 2, 4, 2, 0, 1, 1}));//expected 4
    }

    public static int minJumps(int[] arr) {
        int index = 0, count = 0, val = 1;
        while(index < arr.length) {
            val = maxOnRange(index, val, arr);
            if(val <= 0) return -1;
            index += val;
            count++;
        }
        return count;
    }

    public static int maxOnRange(int start, int end, int[] input) {
        int[] toMax = new int[end];
        System.arraycopy(input, start, toMax, 0, toMax.length);
        return Arrays.stream(toMax).max().getAsInt();
    }
}
