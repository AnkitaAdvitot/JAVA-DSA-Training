import java.util.Scanner;

class Automorphic{
    static boolean isAutomorphic(int n){
        int sq=n*n;
        while(n>0){
            int d=n%10;
            int d1=sq%10;
            if(d!=d1)
                return false;
            n/=10;
            sq/=10;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        
        System.out.println("Is Automorphic "+isAutomorphic(n));
    }
}