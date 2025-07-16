package day2.class_basics;


public class ConstructorChaining {
    public static void main(String[] args) {
    	Student1 s=new Student1();
    	Student1 s1=new Student1(1,"Ankita");
    	Student1 s2=new Student1(2,"Arpita");
    }

}
class Student1{
    int rollNo;
    String name;
    Student1(){
        this(-1,"Unknown");
        System.out.println("default constructor");
   }    
   public Student1(int roll,String name){
        this.name=name;
        this.rollNo=roll;
        System.out.println("parameterized constructor");

   }

}