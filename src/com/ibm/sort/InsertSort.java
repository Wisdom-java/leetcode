package com.ibm.sort;

/**
 * 插入排序  稳定的排序方法
 *         // 6,1,4,7,5,8,5,0
 *         // 1,6,4,7,5,8,5,0
 *         // 1,4,6,7,5,8,5,0
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {6,1,4,7,5,8,5,0};
        // 6,1,4,7,5,8,5,0
        // 1,6,4,7,5,8,5,0
        // 1,4,6,7,5,8,5,0
        int len = arr.length;
        for (int i = 1;i < len; i++){
            //需要插入的数
            int data = arr[i];
            //比较的位置，从排好序的部分最后一个数开始比较
            int j = i - 1;
            for (; j >= 0; j--){
                if (arr[j] > data){
                    //如果插入的数较小时，将原位置较大的数向后后移一位
                    arr[j+1] = arr[j];
                }else{
                    //跳出循环，找到插入位置
                    break;
                }
            }
            //将数据插入
            arr[j+1] = data;
        }
        for(int a : arr){
            System.out.print(a + ",");
        }
    }
}
