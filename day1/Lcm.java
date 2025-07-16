package day1;

import java.util.Scanner;

public  class Lcm{
   static  int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static int lcm(int a,int b){
        return (a*b)/gcd(a, b);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int sec=sc.nextInt();
        System.out.println("Lcm of "+first +" and "+sec+" is "+lcm(first, sec));
    }
}