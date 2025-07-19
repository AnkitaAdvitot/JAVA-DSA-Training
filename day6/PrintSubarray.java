package day6;

import java.util.Scanner;

public class PrintSubarray {
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
			
		}
	}
	static void printOptimized(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			StringBuilder sb=new StringBuilder();
			for(int j=i;j<arr.length;j++) {
				sb.append(arr[j]+" ");
				System.out.println(sb.toString().trim());
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
		print(arr);
		printOptimized(arr);
	}

}
