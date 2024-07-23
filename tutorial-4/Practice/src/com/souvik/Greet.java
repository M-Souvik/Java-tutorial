package com.souvik;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        String name= Name() ;
        System.out.println("Good Morning!,"+name);
    }
    static String Name(){
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter your name:");

        return sc.nextLine();
    }
}
