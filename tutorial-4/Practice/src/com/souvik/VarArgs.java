package com.souvik;


import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      VarArgument(1,2,5,56,78);
      multiple(1,2,"Souvik","Ryan","Alan");//we can pass as many parameters we want in the VarArgument()
    }

    static void VarArgument(int ...n) {
        System.out.println(Arrays.toString(n));
        //In this method , we have basically passed a array with no size as argument in which we can passed as many variable we want
        //It should always stay at the end
    }
    static void multiple(int a,int b,String ...n) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(n));
        //In this method , we have basically passed a array with no size as argument in which we can passed as many variable we want
    }
}
