import java.util.Scanner;

class Palindrome{
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        if(digit==reverse(digit))
            System.out.println("it is palindrome");
        else
            System.out.println("it is not palindrome");

    }
}