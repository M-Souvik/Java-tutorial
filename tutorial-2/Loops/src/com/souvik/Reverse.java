package com.souvik;

public class Reverse {
    public static void main(String[] args) {
        int n=1534236469;
        int result=ReverseInt(n);
        System.out.println("Reverse is "+result);
    }
    static int ReverseInt(int x){
        int res=0;
        double limit=Math.pow(2,31)-1;
        if(x>limit){
            return 0;
        }
        if(x<0){
            x=x*-1;
            while(x>0){
                int rem=x%10;
                x=x/10;
                res=res*10+rem ;
            }
            return res*-1;
        }
        while(x>0){
            int rem=x%10;
            x=x/10;
            res=res*10+rem;
        }
        return res;
    }
}
