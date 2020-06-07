package org.coding.array.leetcode;

/**
 * 最大容量或者说最大面积
 * @link https://leetcode-cn.com/problems/container-with-most-water/
 */
public class MaxCapacity {
    /**
     * 暴力法：拿到所有面积，过程中得最大值
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i=0; i<height.length; i++){
            for (int j =i+1; j<height.length; j++){
                int tempArea = (j-i)*(Math.min(height[i],height[j]));
                if (tempArea > maxArea) {
                    maxArea = tempArea;
                }
            }
        }
        return maxArea;
    }

    /**
     * 两端向内移动法
     * 左右游标放置在两端,矮的向前移动才有可能大于当前的
     */
    public static int maxArea_2m(int[] height) {
        int maxArea = 0;
        int leftCursor = 0;
        int rigthCursor = height.length-1;
        while (leftCursor < rigthCursor){
            int tempArea = (rigthCursor-leftCursor)*(Math.min(height[rigthCursor],height[leftCursor]));
            if (tempArea > maxArea) {
                maxArea = tempArea;
            }
            if (height[rigthCursor] > height[leftCursor]){
                leftCursor++;
            }else {
                rigthCursor--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        maxArea_2m(nums);
    }
}
