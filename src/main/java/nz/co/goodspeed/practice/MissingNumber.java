package nz.co.goodspeed.practice;

import java.io.IOException;

public class MissingNumber {

    public static void main(String[] args) throws IOException {
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.missingNumber(new int[] {1,2,3,5}, 5));
        System.out.println(missingNumber.missingNumber(new int[] {6,1,2,8,3,4,7,10,5}, 10));
        System.in.read();
    }

    public int missingNumber(int[] items, int length) {
        int sum = (length * (1 + length))/2;
        int actualSum = 0;
        for(int i = 0; i < items.length; i++) {
            actualSum += items[i];
        }
        return sum - actualSum;
    }
}
