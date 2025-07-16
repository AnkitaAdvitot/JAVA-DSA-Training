package day1;

import java.util.Scanner;

class Gcd{
    static  int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int sec=sc.nextInt();
        System.out.println("Gcd  is "+gcd(first,sec));
    }
}