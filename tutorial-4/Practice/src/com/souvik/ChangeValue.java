package com.souvik;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0]=89;//if you change the value via ref variable then the original value of array will also change because arrays are mutable
    }
}
