package day1;

import java.util.Scanner;

class Armstrong{
    static boolean isArmstrong(int n){
        String s=String.valueOf(n);
        int len=s.length();
        int temp=n;
        int armstrong=0;
        while(temp!=0){
            double res=Math.pow(temp%10,len);
            armstrong+=res;
            temp/=10;
        }
        return armstrong==n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Is armstrong "+isArmstrong(n));
    }
}