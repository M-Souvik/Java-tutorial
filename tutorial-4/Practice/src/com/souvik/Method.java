package com.souvik;

import java.util.Scanner;

public class Method {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1= in.nextInt();
        System.out.println("Enter the number2:");
        int num2= in.nextInt();
        int rs=sum3(num1,num2);
        System.out.println("The addition will be:"+rs);
    }
    //parametrized method(argument passing)
    static int sum3(int num1,int num2){
        return num1+num2;
    }
    //will not return any value(void)
    static void sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1= in.nextInt();
        System.out.println("Enter the number2:");
        int num2= in.nextInt();
        int add=num1+num2;
        System.out.println("Addition of two numbers: "+add);
    }
    //returns a value
    static int sum2(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1= in.nextInt();
        System.out.println("Enter the number2:");
        int num2= in.nextInt();
        int add=num1+num2;
        return add;
    }

}
