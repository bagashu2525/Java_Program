package Constructor;

public class Child extends Parent{
    String name;
    int age;
    Child(){
        /* Automatic invocation of the super class default constructor */
        //super();
        //calling default constructor of the Parent class(super class)
        System.out.println("This is Child class constructor");
    }
    
}
