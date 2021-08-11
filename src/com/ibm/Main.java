package com.ibm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] data = { 5, 3, 7, 8, 1, 15, 9, 2, 6, 4 };
        mergSort(data,0,data.length - 1);
        System.out.println(Arrays.toString(data));
        int a = 3;
        System.out.println();
    }

    public static void mergSort(int[] data,int left, int right){
        if (left < right){
            int mid = left + (right - left) / 2;
            mergSort(data,left,mid);
            mergSort(data,mid+1,right);
            merge(data,left,mid,right);
        }
    }

    public static void merge(int data[], int left, int mid,int right){
        int[] temp = new int[data.length];
        int currentLeft = left;
        int currentRight = mid + 1;
        int loc = left;
        while(currentLeft <= mid && currentRight <= right){
            if (data[currentLeft] < data[currentRight]){
                temp[loc++] = data[currentLeft++];
            }else{
                temp[loc++] = data[currentRight++];
            }
        }
        while(currentLeft <= mid){
            temp[loc++] = data[currentLeft++];
        }
        while(currentRight <= right){
            temp[loc++] = data[currentRight++];
        }
        for (int i = left; i <= right;i++){
            data[i] = temp[i];
        }
    }
}
