package com.ibm.sort;

import java.util.Arrays;

/**
 *  不是稳定的排序  稳定性指的是 排序后两个相同的元素的相对位置不变
 *   选择排序
 *   5, 3, 7, 8, 1, 15, 9, 2, 6, 4
 *   第一次
 *   1, 3, 7, 8, 5, 15, 9, 2, 6, 4
 *   第二次
 *   1, 2, 7, 8, 5, 15, 9, 3, 6, 4
 *   第三次
 *   1, 2, 3, 8, 5, 15, 9, 7, 6, 4
 *   按照上面的规则知道排序结束
 *   ----
 *   ----
 */

public class SelectSort {
    public static void main(String[] args) {
        int[] data = { 5, 3, 7, 8, 1, 15, 9, 2, 6, 4 };
        for (int i = 0; i < data.length;i++){
            int minLoc = i; //最小值出现的位置
            int min = data[i]; //最小值数值
            for (int j = i + 1; j < data.length; j++){
                if (min > data[j]){
                    min = data[j]; //更新最小值
                    minLoc = j; //更新最小值出现的位置
                }
            }
            //交换当前位置和最小值的位置
            int temp = min;
            data[minLoc] = data[i];
            data[i] = temp;
        }
        System.out.println(Arrays.toString(data));
    }

}
