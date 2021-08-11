package com.ibm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = { 5, 3, 7, 8, 1, 15, 9, 2, 6, 4 };
        for (int i = 0; i < data.length - 1;i++){
            for (int j = 0; j < data.length - i -1;j++){
                if (data[j+1] < data[j]){
                    //不用临时变量 交换 data[j] 和data[j+1]的值
                    data[j+1] = data[j+1] + data[j];
                    data[j] = data[j+1] - data[j];
                    data[j+1] = data[j+1] - data[j];
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
