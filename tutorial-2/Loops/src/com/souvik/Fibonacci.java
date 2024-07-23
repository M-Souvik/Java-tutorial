package com.souvik;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;
        int b=1;
//        for (int i = 2; i <= n; i++) {
//            int temp=b;
//            a=temp ;
//            b=b+a;
//        }
        int count=2;
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;

        }
            System.out.println(b);
    }
}
