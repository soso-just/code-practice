package org.coding.array;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {2,5,6,3,8,4};
        quickSort(array);
        Arrays.stream(array).forEach(item -> {
            System.out.print(item + " ");
        });
    }

    /**
     * 快排实现
     * @param array
     */
    private static void quickSort(int[] array) {
       quickSort(array, 0, array.length-1);
    }

    private static void quickSort(int[] array, int begin, int end) {
        if (begin == end) {
            return;
        }
        int partition = getPartition(array, begin, end);
        quickSort(array, begin, partition-1);
        quickSort(array, partition, end);
    }

    /**
     * 选数&定轴,返回轴下标
     * @param array
     * @param begin
     * @param end
     * @return
     */
    private static int getPartition(int[] array, int begin, int end) {
        if (begin == end) {
            return begin;
        }
        int selectedNum = selectNum(array, begin, end);
        while(begin < end){
            while ((begin< end) &&(array[begin] <= selectedNum)) {
                begin ++;
            }
            array[end]=array[begin];
            while((begin < end) && (array[end] > selectedNum)){
                end--;
            }
            array[begin] = array[end];
        }
        array[end] = selectedNum;
        return end;
    }

    /**
     * 选数
     * @param array
     * @param begin
     * @param end
     * @return
     */
    private static int selectNum(int[] array, int begin, int end) {
        return array[end];
    }
}
