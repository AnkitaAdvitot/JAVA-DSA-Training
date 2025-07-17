package day2.NumberSystem;

import java.util.Scanner;

public class Strong {
	static int factorial(int n) {
		
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	static boolean isStrong(int n) {
		int sum=0,temp=n;
		while(temp>0) {
			sum+=factorial(temp%10);
			temp/=10;
		}
		return sum==n;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        System.out.println(isStrong(n)?" Strong Number ":"Not Strong");
	
	}
}
