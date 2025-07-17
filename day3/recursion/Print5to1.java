package day3.recursion;

public class Print5to1 {
	static void fprint(int n) {
		if(n==0)
			return;
		System.out.println("fprint("+(n-1)+")");
		fprint(n-1);
//		System.out.println(n);
		
		System.out.println("fprint("+n+")");
	}
	public static void main(String[] args) {
		fprint(5);
	}
}
