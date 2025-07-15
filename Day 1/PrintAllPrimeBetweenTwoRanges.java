import java.util.Scanner;

public class PrintAllPrimeBetweenTwoRanges{
   static boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    static void print(int start,int end){
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        print(start, end);
    }
}