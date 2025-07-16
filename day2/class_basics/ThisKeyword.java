package day2.class_basics;


public class ThisKeyword {
    public static void main(String[] args) {
        Demo d=new Demo(10,"Ankita");
        d.display();
        

    }
}
class Demo{
    String name;
    int id;
    public Demo(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id+" "+name);

    }
}