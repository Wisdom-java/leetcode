package com.ibm.sort;

import java.util.Arrays;

/**
 * 快速排序
 * 不稳定的排序
 */
public class QuicklySort {
    public static void main(String[] args) {
        int[] data = { 3 , 2 ,1 };
        qSort(data,0,data.length - 1);
        System.out.println(Arrays.toString(data));
    }
    // 3 2 1
    // 1 2 3

    public static void qSort(int[] data,int left, int right){
        int ll = left;  //左边指针
        int rr = right; //右边指针
        int base = data[left]; //选取第一个数作为基准
        while (ll < rr){
            //从最后面循环判断数是不是大于基准数 如果大于基准数 就将指针向前移动一个
            while(ll < rr && data[base] <= base){
                rr--;
            }
            // 必须满足 ll < rr
            if (ll < rr){
                //找到符合条件的位置 交换两个数的位置
                data[ll] = data[ll] + data[rr];
                data[rr] = data[ll] - data[rr];
                data[ll] = data[ll] - data[rr];
                ll++;
            }
            // 在末尾找到一个比基准小的数，开始从前面找
            // 从最前面循环判断数是不是小于基准数 如果小于基准数 就将指针向后移动一个
            while(ll < rr && data[base] >= base){
                ll++;
            }
            if (ll < rr){
                //找到符合条件的位置 交换两个数的位置
                data[ll] = data[ll] + data[rr];
                data[rr] = data[ll] - data[rr];
                data[ll] = data[ll] - data[rr];
                rr--;
            }
            //递归完成基准数两边的部分
            if (left < ll){
                qSort(data,left,ll -1);
            }
            if (ll < right){
                qSort(data,ll + 1, right);
            }
        }
    }
}
