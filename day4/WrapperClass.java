package day4;

public class WrapperClass {
	public static void main(String[] args) {
		int a=10;
		Integer tempa=a; // autoboxing
		System.out.println("Autoboxing "+tempa);
		int b=tempa;//unboxing 
		System.out.println("Unboxing "+b);
	}
}
