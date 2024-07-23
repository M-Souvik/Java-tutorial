package com.souvik;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> multilist=new ArrayList<>(5);
        Scanner sc=new Scanner(System.in);

        //initialisation(imp)
        for (int i = 0; i < 3; i++) {
            multilist.add(new ArrayList<>());

        }
        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multilist.get(i).add(sc.nextInt());
            }
        }
        System.out.print(multilist);
    }
}
