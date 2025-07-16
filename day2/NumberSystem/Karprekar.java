package day2.NumberSystem;

import java.util.Scanner;

public class Karprekar {
	static boolean isKarprekar(int n) {
		if(n<=0)
			return false;
		int sq=n*n;
		int temp=sq,len=0;
		while(temp>0) {
			len++;
			temp/=10;
		} 
		int c=0,s1=0;
		temp=sq;
		while(c<len/2) {
			s1=s1*10+temp%10;
			c++;
			temp/=10;
		}
		int r=0;
		while(s1>0) {
			r=r*10+s1%10;
			s1/=10;
		}
		if(r<=0)
			return false;
		return (r+temp)==n;
	}
	public static void main(String args[]) {
		//A Kaprekar number is a non-negative integer where the sum of the number's 
		//square's digits, when split into two parts (not both zero), equals the original number
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        System.out.println(isKarprekar(n)?" Karprekar Number ":"Not Karprekar");
	}
}
