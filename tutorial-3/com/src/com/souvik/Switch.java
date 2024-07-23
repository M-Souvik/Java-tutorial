package com.souvik;

import java.util.Scanner;

public class Switch {
        public static void main(String[] args) {

           Scanner sc=new Scanner(System.in);
            System.out.println("Enter fruit name");
//            String fruit=sc.next();
//            switch (fruit) {
//                case "Mango" -> System.out.println("King of Fruits");
//                case "Apple" -> System.out.println("A red fruit");
//                case "Orange" -> System.out.println("A sour fruit");
//                default -> System.out.println("Invalid choice");
//            }
            int day= sc.nextInt();
            switch (day){
                case 1,2,3,4,5-> System.out.println("Weekdays");
                case 6,7-> System.out.println("Weekends");
            }
    }
}
