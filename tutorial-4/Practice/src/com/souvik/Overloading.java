package com.souvik;

public class Overloading {
    //Situation where the method name is same but the parameters are different
    public static void main(String[] args) {
        method(2);//1st will be called
        method("Souvik");//2nd will be called
    }
//When the argument is integer it will use the first one if argument is string then the 2nd one will b invoked
    static void method(int a) {
        System.out.println(a);
    }
    //either the parameter should have different datatypes or the no. of parameter passed should be different
    static void method(String name) {
        System.out.println("Greeting,"+name);
    }


}
