package Constructor;

public class GrandChild extends Child{
        GrandChild(){
            /* Automatic invocation of the super class default constructor */
            //super();
            //calling constructor of Child class since it is super to GrandChild Class
            System.out.println("This is GrandChild class constructor");
        }
    
    
}
