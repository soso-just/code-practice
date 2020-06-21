package org.coding.interview;

/**
 * 有序数组，取绝对值最小的数
 */
public class MinNum {

    public  static Integer  findMinNum(int[] array){
        if (array.length ==0) {
            return null;
        }
        if (array[0]>= 0) {
            return array[0];
        }
        if (array[array.length-1] < 0) {
            return array[array.length-1];
        }
        //找出左负右正的位置
        return findMinNum(array, 0, array.length-1);
    }

    private static int findMinNum(int[] array, int begin, int end) {

        //除以2，进行2分
        int index = (begin + end) >>1;

        //为0直接返回
        if (array[index] == 0) {
            return index;
        }

        //大于0往左找
        if(array[index] > 0){
            int pre = index-1;
            if (array[pre] <= 0) {
                if ((0-array[pre]) > array[index]) {
                    return array[index];
                }else {
                    return array[pre];
                }
            }else{
                return findMinNum(array, begin, pre);
            }
        }else {
            //小于0 往右找
            int after = index+1;
            if (array[after] >= 0) {
                if ((0-array[index]) > array[after]) {
                    return array[after];
                }else {
                    return array[index];
                }
            }else{
                return findMinNum(array, after, end);
            }
        }

    }

    public static void main(String[] args) {
        /**
         * {-10,-8,-3,2,5}
         * {-10,-8,-3,2,5,7,9}
         * {-10,-8,-3,0,2,5}
         * {-10,-8,-3}
         * {0,2,5}
         * {-2,5}
         */
        int[] array0 = {-10,-8,-3,2,5};
        int[] array1 = {-10,-8,-3,2,5,7,9};
        int[] array2 = {-10,-8,-3,0,2,5};
        int[] array3 = {-10,-8,-3};
        int[] array4 = {0,2,5};
        int[] array5 = {-2,5};

        System.out.println(findMinNum(array0));
        System.out.println(findMinNum(array1));
        System.out.println(findMinNum(array2));
        System.out.println(findMinNum(array3));
        System.out.println(findMinNum(array4));
        System.out.println(findMinNum(array5));

    }
}
