package org.coding.array.leetcode;

public class MoveZero {
    /**
     * 不为空的值前移，最后填充0
     */
    public void moveZeroes(int[] nums) {
        //不为空的下标
        int notNullIndex =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[notNullIndex] = nums[i];
                notNullIndex++;
            }
        }
        for(int i= notNullIndex; i< nums.length; i++){
            nums[i] = 0;

        }
    }
}
