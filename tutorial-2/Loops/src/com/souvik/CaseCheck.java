package com.souvik;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char word=sc.next().trim().charAt(0);
        if(word>='a' && word<='z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }
    }
}
