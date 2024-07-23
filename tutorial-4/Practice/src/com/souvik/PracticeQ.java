package com.souvik;

import java.util.Scanner;

public class PracticeQ {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int n= input.nextInt();
        System.out.println(isPrime(n));
    }

   static boolean isPrime(int num) {
      if(num<=1){
          return false;
      }
      int c=2;
       while (c*c <=num) {
           if (num%c==0) {
               return false;
           }
           c++;
       }
       return c*c>num;

    }

}
