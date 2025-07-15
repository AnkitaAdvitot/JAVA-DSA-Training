import java.util.Scanner;

public class PerfectNumber {
   // a positive integer that equals the sum of its proper divisors (divisors excluding the number itself). 
    static boolean isPerfect(int n){
        int sum=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                sum+=i;
        }
        if(sum==n)
            return true;
        return false;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        System.out.println("Is Perfect Number "+isPerfect(n));
    }
}
