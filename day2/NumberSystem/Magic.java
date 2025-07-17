package day2.NumberSystem;

import java.util.Scanner;

public class Magic {
	static boolean isMagic(int n) {
		if(n==1)
			return true;
		
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		if(sum==n)
			return false;
	   return isMagic(sum);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        System.out.println(isMagic(n)?" Magic Number ":"Not Magic");

	}
}
