package com.souvik;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=5;
        arr[4]=7;
        System.out.println(arr[0]);
        //using for in loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= sc.nextInt();
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+" ");
//        }
        //for-each loop
//        for (int j : arr) {
//            System.out.println(j + " ");
//        }
        //USING toString()
//        System.out.println(Arrays.toString(arr));
//arrays of object

     String[] name=new String[5];
        for (int i = 0; i < name.length; i++) {
            name[i]= sc.next();
        }

        System.out.println(Arrays.toString(name));
        name[4]="Souvik";
        System.out.println(Arrays.toString(name));
    }

}
