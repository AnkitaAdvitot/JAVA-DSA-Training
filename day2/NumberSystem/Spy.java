package day2.NumberSystem;

import java.util.Scanner;
public class Spy {

   public static boolean isSpy(int n){
        // a spy number whose sum and product are equal
        int sum=0,prod=1;
        while(n>0){
            int d=n%10;
            sum+=d;
            prod*=d;
            n/=10;
        }
        if(sum==prod)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Is Spy "+isSpy(n));
    }
}
