package com.souvik;

import java.util.Scanner;

public class TypCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //type casting
//        int num=(int)(34.67f);
//        System.out.println(num);

        //type promotion
//        byte a=12;
//        byte b=124;
//        byte c=124;
//
//        int d=(a*b)/c;

//        System.out.println(d);

        byte b=12;
        char c='a';
        short s=1224;
        int i=12;
        float f=12.67f;
        double d=1.2222;
//lower the flow,higher the size
        double r=(f*c)+(s*i)+(b*d);
        System.out.println(r);
        System.out.println((f*c)+" "+(s*i)+" "+(b*d));



    }
}
