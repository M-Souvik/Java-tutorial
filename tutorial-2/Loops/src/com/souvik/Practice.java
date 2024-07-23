package com.souvik;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a= sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b= sc.nextInt();
        System.out.println("Enter the 3rd number");
        int c= sc.nextInt();
//        if (a>b||a>c) {
//            System.out.println(a+" is largest");
//        } else if (b>c) {
//            System.out.println(b+" is largest");
//        }else {
//            System.out.println(c+" is largest");
//        }
        //Alternative(using Math)
        float max=Math.max(a,Math.max(b,c));
        System.out.println(max);


    }
}
