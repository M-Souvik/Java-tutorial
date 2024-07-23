package com.souvik;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        //declaration of multid array
        int[][] arr=new int[3][3];//rows is necessary but col is not
        //initialisation
        int[][] arr2={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };//it is stored as array inside of an index of array in memory

        //ip for 2d array
        Scanner sc=new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=sc.nextInt();
            }
        }
        //op1
//        for (int[] row : arr) {
//            for (int col : row) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }
        for(int[] row:arr){
            System.out.println(Arrays.toString(row));
        }
    }
}
