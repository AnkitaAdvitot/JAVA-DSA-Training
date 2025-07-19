package day6;

import java.util.Scanner;

public class SubArraySum {

	static void sum(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=arr[k];
					System.out.print(arr[k]+" ");
				}
				System.out.print("sum "+sum);
				System.out.println();
			}
			
		}
	}
	static void sumWithoutk(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				
				sum+=arr[j];
				System.out.print(sum+" ");
				
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String[] splited=str.split(",");
		int arr[]=new int[splited.length];
		int i=0;
		for(String s:splited) {
			arr[i++]=Integer.parseInt(s);
		}
		sum(arr);
		sumWithoutk(arr);
	}

}
