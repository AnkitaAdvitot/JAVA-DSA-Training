package day2.class_basics;


public class Main{
    public static void main(String[] args) {
        Student st=new Student();
        System.out.println(st.rollNo); // default is 0 
        st.rollNo=20;
        System.out.println(st.rollNo);
        System.out.println(st.name); // default is null
        st.name="Ankita";
        System.out.println(st.name);
        st.collegeName="WIT";
        System.out.println(st.collegeName);
    }
}
class Student{
    int rollNo;
    String name;
    String collegeName;

}