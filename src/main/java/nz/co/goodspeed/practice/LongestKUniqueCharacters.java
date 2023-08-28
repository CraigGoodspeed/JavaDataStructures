package nz.co.goodspeed.practice;

import java.util.*;
import java.util.stream.IntStream;

public class LongestKUniqueCharacters {
    public static void main(String[] args) {
        System.out.println(longestkSubstr("aabacbebebe", 3));//97
        System.out.println(longestkSubstr("aaaaaaa", 2));//97
        System.out.println(longestkSubstr("untxym", 4));
    }

    public static int longestkSubstr(String s, int k) {
        //given a string
        //count the number of unique characters
        //smaller than k return -1
        //greater than k return the length of the largest string with k characters
        int[] m = new int[128];
        int uniq = 0, i = 0, j = 0, res = 0, n = s.length();

        while (j < n) {
            // sliding the j-pointer till we have a valid substring
            while (j < n) {
                if (m[s.charAt(j)] == 0) uniq++;
                m[s.charAt(j)]++;
                // if the number of uniq characters increases k, we stop.
                if (uniq > k) break;
                j++;
            }

            // checking if the unique characters are equal to k or k + 1
            if (uniq >= k) res = Math.max(res, j - i);

            if (j == n) break;

            // sliding the i-pointer till we again get k unique characters in
            // the substring
            while (i < n) {
                if (m[s.charAt(i)] == 1) uniq--;
                m[s.charAt(i)]--;

                if (uniq == k) break;
                i++;
            }
            i++;
            j++;
        }
        if (res == 0) return -1;
        return res;
    }
}
