package day2.NumberSystem;

import java.util.Scanner;

public class Duck {
    //a positive number that contains the digit zero, but the zero is not the first digit
    static boolean isDuck(int n){
        int len=0;
        int temp=n;
        while(temp>0){
            len++;
            temp/=10;
        }
        int count=0;
        temp=n;
        boolean flag=false;
        while(count<len-1){
            int d=temp%10;
            if(d==0)
                flag=true;
            temp/=10;
            count++;
        }
        return temp%10!=0 && flag;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        System.out.println(isDuck(n)?"Is duck number ":" not a duck number ");
    }
}
