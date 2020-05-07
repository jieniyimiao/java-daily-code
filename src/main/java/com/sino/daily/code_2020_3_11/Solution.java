package com.sino.daily.code_2020_3_11;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * create by 2020-03-11 21:28
 *
 * @author caogu
 */
public class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        double sum = Arrays.stream(A).sum() / 3;

        int index1 = getIndex(A, 0, sum);
        if (index1 == -1) {
            return false;
        }

        int index2 = getIndex(A, index1, sum);
        if (index2 == -1) {
            return false;
        }
        int index3 = getIndex(A, index2, sum);
        if (index3 == -1) {
            return false;
        } else {
            return true;
        }

    }

    private int getIndex(int[] A, int start, double sum) {
        double partSum = 0;
        for (int i = start; i < A.length; i++) {
            partSum += A[i];
            if (partSum == sum) {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().canThreePartsEqualSum(new int[] {0,2,1,-6,6,-7,9,1,2,0,1}));
        System.out.println(new Solution().canThreePartsEqualSum(new int[] {0,2,1,-6,6,7,9,-1,2,0,1}));
        System.out.println(new Solution().canThreePartsEqualSum(new int[] {3,3,6,5,-2,2,5,1,-9,4}));
    }

}
