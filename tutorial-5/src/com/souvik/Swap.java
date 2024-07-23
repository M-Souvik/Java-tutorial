package com.souvik;


import java.util.Arrays;

public class Swap {


    public static void main(String[] args) {
        int[] arr={12,23,45,6,7,88,44};
//        swap(arr,1,2);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

   static void swap(int[] arr, int idx1, int idx2) {
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;

    }
    static void reverse(int[] array){
       int start=0;
       int end=array.length-1;
       while(start<end){
           swap(array,start,end);
           start++;
           end--;
       }


    }
}
