package com.souvik;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char choice;
        int a;
        int b;
        int c=0;
        do {
            System.out.println("num1:");
             a= sc.nextInt();
            System.out.println("num2:");
             b= sc.nextInt();
        System.out.println("1.Add\n2.Subtract\n3.Multiplication\n4.Division\nEnter your choice:");
        choice = sc.next().trim().charAt(0);
            if (choice == '1') {
                c=a+b;
                System.out.println(a+"+"+b+"="+c);
            } else if (choice=='2') {
                c=a-b;
                System.out.println(a+"-"+b+"="+c);
            }else if (choice=='3') {
                c=a*b;
                System.out.println(a+"*"+b+"="+c);
            }else if (choice=='4') {
                c=a/b;
                System.out.println(a+"/"+b+"="+c);
            }else{
                System.out.println("Invalid choice");
            }
        }while(choice!='x');
    }
}
