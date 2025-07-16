package day1;

import java.util.Scanner;

public class EvenOrOdd {
    static boolean isEvenOrOdd(int n){
        return (n%2==0);
    }
    static String check(int n){
        return (n%2==0)?"is even ":"is odd";
    }
    static boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Is Even "+isEvenOrOdd(n));
        System.out.println(check(n));
        System.out.println(isPrime(n));
    }
}
