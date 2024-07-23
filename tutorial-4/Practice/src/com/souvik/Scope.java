package com.souvik;

public class Scope {
    public static void main(String[] args) {
        int a=10;//initialising the variable a,cant be used outside this function
        int b=20;
        String name="Souvik";
        {
            a=99;//updating
            int c=10;//only valid up to this block(curly braces)
            name="Anushka";//updating the string name
        }
//        System.out.println(c);  c can be used only in its own block
        System.out.println(name);//o/p:Anushka
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            //the integer i is only valid up to the for loop
        }
    }
    static void marks(){
        int marks=100;
        //cant b used by main function
    }
}
