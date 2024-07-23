package com.souvik;


public class Max {
    public static void main(String[] args) {
        int[] arr={12,23,45,6,7,88};
        System.out.println(maxRange(arr,0,5));
        System.out.println(arr.length);
    }

    static int maxRange(int[] array,int start,int end) {
        if (end>start){
            return -1;
        }

        if (array == null) {
            return -1;
        }
        int maxint =array[start];
        for (int i = start; i <= end; i++) {
            if(maxint <array[i]) {
                maxint = array[i];
            }
        }
        return maxint;
    }
    static int max(int[] array){
        if (array.length == 0) {
            return -1;
        }
        int maxint =array[0];
        for (int i = 0; i <= array.length; i++) {
            if(maxint <array[i]) {
                maxint = array[i];
            }
        }
        return maxint;
    }

}
