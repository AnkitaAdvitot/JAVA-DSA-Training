package day2.NumberSystem;

import java.util.Scanner;

public class NIven {
    
   public static boolean isNiven(int n){
        // a  number whose sum divides original number completely
        int sum=0,temp=n;
        while(temp>0){
            int d=temp%10;
            sum+=d;
           
            temp/=10;
        }
        if(n%sum==0)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Is Niven  "+isNiven(n));
    }
}
