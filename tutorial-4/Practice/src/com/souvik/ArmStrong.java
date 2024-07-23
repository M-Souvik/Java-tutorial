package com.souvik;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int n= sc.nextInt();
        System.out.println(Armstrong(n));
    }

    static boolean Armstrong(int num) {
        int origin=num;
        int sum=0;
        while(num>0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum+(rem * rem * rem) ;
        }
        return sum==origin;
    }


}
