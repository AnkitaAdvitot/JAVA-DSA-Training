package day2.AlphabetPattern;

import java.util.Scanner;

public class IPattern {
    static void print(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 ||i==n-1||j==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Input height of the letter K
        print(n);
    }
}
