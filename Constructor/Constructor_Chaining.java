package Constructor;

public class Constructor_Chaining {
    public static void main(String[] args){
        GrandChild gc1= new GrandChild();
        /*
         * Parent
         *   ^
         *   |
         *   |
         * Child
         *   ^
         *   |
         *   |
         * GrandChild
         * 
         * Construtor chaining allows constructor calling from same class or base class
         * Here , base class GrandChild call Constructor of its Super class Child and
         * base class Child Calls Constructor of its super class Parent through constructor
         *   
         * 
         * 
         */
    }
}
