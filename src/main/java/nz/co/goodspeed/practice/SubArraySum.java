package nz.co.goodspeed.practice;

import java.util.ArrayList;

public class SubArraySum {
    /*
    Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements
from 2nd position to 4th position
is 12.

Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements
from 1st position to 5th position
is 15.

     */

    public ArrayList<Integer> subArraySum(int[] data, int length, int sum) {
        ArrayList<Integer> toReturn = new ArrayList<>();
        toReturn.add(-1);
        int currentSum = 0;
        int trim = 0;
        for(int index = 0; index < length ; index++) {
            currentSum += data[index];
            while(currentSum > sum) {
                currentSum -= data[trim];
                trim++;
            }
            if (currentSum == sum && currentSum > 0) {
                toReturn.clear();
                toReturn.add(trim + 1);
                toReturn.add(index + 1);
                break;
            }
        }
        return toReturn;
    }
}
