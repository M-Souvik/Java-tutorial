package com.souvik;

public class Shadowing {
    static int x=78;//can b used by every methods(main,sample) in this class
    public static void main(String[] args) {
        System.out.println(x);//o/p=78
        int x=90;//class variable overwriting the global variable outside the main method
        System.out.println(x);//o/p=90
        sample();
    }

    static void sample() {
        System.out.println(x);//o/p=78
    }

}
