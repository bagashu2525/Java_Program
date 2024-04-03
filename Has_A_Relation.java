/*Has-A realationship is also known as aggregation
 * If a class have an entity reference, it is known as Aggregation
 * Help in code reusability in absence of inheritance
 * 
 * The code below, is an example where we describe that a Student(It is a class) has a Name(class) and Address(class)
 * Where reference of the Name class and Address Class is created in Student class.
*/

import javax.management.loading.PrivateClassLoader;

class Name{
    private String FirstName;
    private String MiddleName;
    private String LastName;

    Name(String FirstName,String MiddleName,String LastName){
        this.FirstName=FirstName;
        this.MiddleName=MiddleName;
        this.LastName=LastName;
    }
    public String toString(){
        return this.FirstName+" "+this.MiddleName+" "+this.LastName;
    }
}
class Address{
    private String housenumber;
    private String City;
    private int pin;

    Address(String housenumber,String City,int pin){
        this.housenumber=housenumber;
        this.City=City;
        this.pin=pin;
    }
    public String toString(){
        return this.housenumber+" "+this.City+" "+this.pin;
    }
}
class Student{
    String SchoolName;
    String DOB;
    //Entity reference
    Name name;
    Address address;

    Student(String SchoolName,String DOB,Name name,Address address){
        this.SchoolName=SchoolName;
        this.DOB=DOB;
        this.name=name;
        this.address=address;
    }
    public String toString(){
        return "Name : "+this.name+"\nSchool Name :"+this.SchoolName+"\nDOB: "+this.DOB+"\nAddress: "+this.address;
    }
}
public class Has_A_Relation {
    public static void main(String[] args ){
        //Creating object of Name class to assign name to student
        Name n1= new Name("Priyanka","Das","Gupta");
        //Creating object of Address class to assign address to the student
        Address a1= new Address("21/h/15","Kolkata",700030);
        //Creating object of Student class
        Student s1=new Student("KendraVidyalay","22/05/2009",n1,a1);
        System.out.println(s1);

    }
}
