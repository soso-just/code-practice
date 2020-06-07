package org.coding.array.leetcode;

import java.util.HashSet;

public class RemoveSortedDuplicates {

    /**
     * 已排序数组移除重复元素
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int cursor = 0;
        for (int i=1; i<nums.length; i++){
            if (nums[i] != nums[cursor]) {
                nums[++cursor] = nums[i];
            }
        }
        return (cursor+1);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        removeDuplicates(nums);
    }
}
