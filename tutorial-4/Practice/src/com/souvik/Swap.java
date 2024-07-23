package com.souvik;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1=sc.nextInt();
        System.out.println("Enter the number 2:");
        int num2=sc.nextInt();
        SwapNum(num1,num2);
    }
    static void SwapNum(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
