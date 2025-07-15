public class ConstructorChaining {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student(1,"Ankita");
        Student s2=new Student(2,"Arpita");
    }

}
class Student{
    int rollNo;
    String name;
   Student(){
        this(-1,"Unknown");
        System.out.println("default constructor");
   }    
   public Student(int roll,String name){
        this.name=name;
        this.rollNo=roll;
        System.out.println("parameterized constructor");

   }

}