package day2.NumberSystem;

import java.util.Scanner;

public class HealthyDeficient {
	
	static boolean isHealthyDeficient(int n) {
		int sum=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				sum+=i;	
		}
		return sum<n;
	}
	public static void main(String args[]) {
		//A deficient number is a positive integer where 
		//the sum of its proper divisors (divisors excluding the number itself) 
		//is less than the number itself. 
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        System.out.println(isHealthyDeficient(n)?" HealthyDeficient Number ":"Not HealthyDeficient");
	}
}
