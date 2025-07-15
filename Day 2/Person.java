public class Person {
    String name;
    int age;
    String emailId;
    String city;
    static int count=0;
    public Person(String name,int age,String emailId,String city){
        this.name=name;
        this.age=age;
        this.emailId=emailId;
        this.city=city;
        count++;
    }
    static int getCount(){
        return count;
    }
    public static void main(String[] args) {
        Person p=new Person("Ankita",20,"ankita@gmail.com","Akkalkot");
        Person p1=new Person("Ankita",20,"ankita@gmail.com","Akkalkot");
        
        System.out.println("Count of Object creation "+Person.getCount()); 
    }    
}
