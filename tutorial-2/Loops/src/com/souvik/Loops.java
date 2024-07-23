package com.souvik;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        double Salary;
//
//            System.out.println("Please enter your salary:");
//            Salary = sc.nextFloat();
//        if(Salary>=10000){
//            Salary=Salary*0.1+Salary;
//            System.out.println("Your new salary is "+Salary);
//        } else{
//            Salary=Salary*0.05+Salary;
//            System.out.println("Your new  salary is "+Salary);
//        }

//            if (Salary > 10000) {
//                Salary = Salary + 3000;
//                System.out.println("Your new Salary hike" + Salary);
//
//            } else if (Salary > 20000) {
//                Salary = Salary + 5000;
//                System.out.println("Your new Salary hike" + Salary);
//            } else {
//                Salary = Salary + 1000;
//                System.out.println("Your new Salary hike" + Salary);
//            }
        //for loop
//            for(int i=1;i<=5;i++){
//                System.out.println(i);
//
//            }
            //while  loop
        System.out.println("Please enter your number:");
            int num= sc.nextInt();
//            while(num<=5){
//                System.out.println(num);
//                num++;
//            }
            //do-while loop
            do{
                System.out.println("hello");
            }while (num<=5);
    }
}