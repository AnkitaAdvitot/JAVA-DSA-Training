
import java.util.Scanner;

public class SumOfDigits {
    static int sum(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        System.err.println("Sum is "+sum(digit));
    }
}
