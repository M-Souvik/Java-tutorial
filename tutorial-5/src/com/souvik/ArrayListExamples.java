package com.souvik;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        //used when the size of array is
        // unknown
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(12);//adding element to the arraylist
        list.add(125);
        list.add(126);
        list.add(120);
        list.add(129);
        System.out.println(list);
        System.out.println(list.contains(126));//checks whether the list contains the given element
        list.set(1,123);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);




    }
}
