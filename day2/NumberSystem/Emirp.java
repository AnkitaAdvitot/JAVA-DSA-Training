package day2.NumberSystem;

import java.util.Scanner;

public class Emirp {
	static boolean isPrime(int n) {
		for(int i=2;i<n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	static int reverse(int n) {
		int rev=0;
		while(n>0) {
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
	}
	static boolean isEmirp(int n) {
		if(!isPrime(n))	
			return false;
		if(reverse(n)==n)
			return false;
		int rev=reverse(n);
		return isPrime(rev);
	}
	public static void main(String args[]) {
		//An emirp is a prime number that remains prime when 
		//its digits are reversed, but the reversed number is different 
		//from the original number
		  Scanner sc=new Scanner(System.in);
	        System.out.println("Enter number ");
	        int n=sc.nextInt();
	        System.out.println(isEmirp(n)?" Emirp Number ":"Not Emirp");
	}
}
