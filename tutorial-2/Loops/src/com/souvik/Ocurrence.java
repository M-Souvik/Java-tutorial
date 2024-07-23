package com.souvik;

public class Ocurrence {
    public static void main(String[] args) {
        int n=139390;
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==3){
                count += 1;
            }
            n=n/10;
            System.out.println("3 occurs "+count+" times");
        }
    }
}
