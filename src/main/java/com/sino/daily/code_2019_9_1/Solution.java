package com.sino.daily.code_2019_9_1;

import java.util.Arrays;

/**
 * create by 2019-11-24 10:15
 *
 * @author caogu
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[i] = nums[(nums.length - k + i) % nums.length];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = tmp[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2};
        new Solution().rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
