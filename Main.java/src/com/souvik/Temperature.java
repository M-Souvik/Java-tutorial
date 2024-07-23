package com.souvik;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        System.out.println("Pls enter the  temperature");
        float temperature= temp.nextFloat();
        double kelvin=temperature+273.15;
        System.out.println("The temperature in kelvin is "+kelvin);
        double fahrnheit=temperature*9/2+32;
        System.out.println("The temprature in fahrenheit"+fahrnheit);


    }
}
