package day2.AlphabetPattern;

import java.util.Scanner;

public class KPattern {
    static void print(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
            for(int j=0;j<n;j++){
                if(j==n-i-1 && i<n/2)
                    System.out.print(" ".repeat(j-1)+"*");
                else if(i==j && i>=n/2)
                    System.out.print(" ".repeat(j-1)+"*");

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
