package Constructor;

public class Child extends Parent{
    String name;
    int age;
    Child(){
        super();//calling default constructor of the Parent class(super class)
        System.out.println("This is Child class constructor");
    }
    
}
