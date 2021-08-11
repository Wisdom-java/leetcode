package com.ibm.sort;

import java.util.Arrays;

/**
 *  归并排序  使用递归   稳定的排序方法
 *  5, 3, 7, 8, 2, 6, 9, 2, 6, 5
 *              分
 *  5 3 7 8 2       6 9 2 6 5
 *              分
 *  5 3    7 8 2       6 9   2 6 5
 *              排序
 *  3 5    2 7 8        6 9   2 5 6
 *             合并
 *  2 3 5 7 8        2 5 6 6 9
 *             合并
 *  2 2 3 5 5 6 6 7 9
 */
public class MegrSort {
    public static void main(String[] args) {
        int[] data = { 5, 3, 7, 8, 2, 6, 9, 2, 6, 5 };
        megerSort(data,0,data.length -1);
        System.out.println(Arrays.toString(data));
    }

    public static void megerSort(int[] data,int left, int right){
        if (left < right){ //相等的时候表示只有一个数 不需要再拆分
            int mid = (right + left) / 2;
            megerSort(data,left,mid);
            megerSort(data,mid+1,right);
            meger(data,left,mid,right);
        }
    }

    public static void meger(int[] data,int left,int mid,int right){
        int[] temp = new int[data.length];
        int currentLeft = left;
        int currentRight = mid + 1;
        int loc = left;
        while (currentLeft <= mid && currentRight <= right){
            if (data[currentLeft] < data[currentRight]){
                temp[loc] = data[currentLeft];
                currentLeft++;
                loc++;
            }else{
                temp[loc] = data[currentRight];
                currentRight++;
                loc++;
            }
        }
        //将还没有排完序的数继续排完
        while (currentLeft <= mid){
            temp[loc] = data[currentLeft];
            currentLeft++;
            loc++;
        }
        while (currentRight <= right){
            temp[loc] = data[currentRight];
            currentRight++;
            loc++;
        }
        for(int i = left; i <= right; i++){
            data[i] = temp[i];
        }

    }
}
