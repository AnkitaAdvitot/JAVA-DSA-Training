package day2.AlphabetPattern;

public class NPattern {
    static void print(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i==j||j==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
     print(5);   
    }
}
