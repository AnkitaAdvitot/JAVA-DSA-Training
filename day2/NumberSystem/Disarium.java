package day2.NumberSystem;

import java.util.Scanner;

public class Disarium {

    static boolean isDisarium(int n){
        // a number is Disarium whose power of each digit with its ith position sum equals to original number
        int len=0;
        int temp=n;
        int sum=0;
        while(temp>0){
            temp/=10;
            len++;
        }
        temp=n;
        while(temp>0){
            int d=temp%10;
            sum+=Math.pow(d,len--);
            temp/=10;
        }
        return sum==n;
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        System.out.println("Is Disarium Number "+isDisarium(n));
    }
}
