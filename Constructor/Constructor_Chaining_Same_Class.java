package Constructor;

public class Constructor_Chaining_Same_Class {
    int x;
    //default constructor
    Constructor_Chaining_Same_Class(){
        this(5);//calling the parameterized constructor from default construtor
    }
    //parameterized constructor
    Constructor_Chaining_Same_Class(int x){
        this.x=x;
    }
    public static void main(String[] args){
        Constructor_Chaining_Same_Class obj1= new Constructor_Chaining_Same_Class();
        Constructor_Chaining_Same_Class obj2= new Constructor_Chaining_Same_Class(10);
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
