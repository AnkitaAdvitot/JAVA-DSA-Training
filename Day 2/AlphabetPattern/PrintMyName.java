
import java.util.Scanner;

public class PrintMyName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            printA(n,i);
            System.out.print("  ");
            printN(n,i);
            System.out.print("  ");

            printK(n,i);
            System.out.print("  ");

            printI(n,i);
            System.out.print("  ");

            printT(n,i);
            System.out.print("  ");

            printA(n,i);
            System.out.println();
        }
        
        sc.close();
    }
   static void printA(int n,int i){
      
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n/2||j==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
        
    }
     static void printN(int n,int i){
    
            for(int j=0;j<n;j++){
                if(j==0||i==j||j==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
         
    }
    
     static void printK(int n,int i){
                for (int j = 0; j < n; j++) {
            if (j == 0) {
                System.out.print("* ");
            } else if ((i < n / 2 && j == n - i - 1) || (i >= n / 2 && j == i)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
           
    }
     static void printI(int n,int i){
            for(int j=0;j<n;j++){
                if(i==0 ||i==n-1||j==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
           
    }
     static void printT(int n,int i){
            for(int j=0;j<n;j++){
                if(i==0||j==n/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
           
    }
}