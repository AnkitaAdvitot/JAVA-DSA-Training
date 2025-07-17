package day3.basics;

public class SwapNumber {
	static int a=10;
	static int b=20;
	static void swap(int a,int b) {
		//without temp or airthmetic operator
		SwapNumber.a=b;
		SwapNumber.b=a;
	}
	static void swapAirthmetic(int a,int b) {
		
	}
	public static void main(String args[]) {
		System.out.print(a+" "+b);
		swap(a,b);
		System.out.print(a+" "+b);
	}
}
