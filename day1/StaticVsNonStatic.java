package day1;

import java.util.Scanner;

class StaticVsNonStatic{
    int a=10;
    static int b=20;
    public static void main(String[] args){
        int a=10;
        System.out.println(a);
        // System.out.println(a);   get an erroe non static can not access under static block
        System.out.println(b);
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18)
            System.out.println("not eligible");
        else if(age>=18 && age<=21) 
            System.out.println(" eligible but cant drink");
        else
            System.out.println("eligible and can drink");


        a=sc.nextInt();
        b=sc.nextInt();
       int c=sc.nextInt();
        if(a>b && a>c)
            System.out.println(a+" is greater");
        else if (b>c)
            System.out.println(b+" is greater");
        else 
            System.out.println(c+"is greater");

    }
}