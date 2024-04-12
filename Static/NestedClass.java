//it is a static nested class
public class NestedClass {
    static class InnerClass{
        public void method(){
            System.out.println("This is the inner class.");
        }
    }
    public static void main(String[] args){
        //no need of object creation of outer class NestedClass because inner class is static
        NestedClass.InnerClass obj1= new NestedClass.InnerClass();
        obj1.method();//calling inner class method
    }
}
