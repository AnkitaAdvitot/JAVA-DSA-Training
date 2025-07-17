package day3.recursion;

import java.util.Scanner;

public class Print1ToN {
	static void print(int n,int i) {
		if(i>n)
			return;
		System.out.println(i);
		print(n,i+1);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		print(sc.nextInt(),1);
	}
}
