package Inner_Class;


public class OuterClass {
    
    class InnerClass{
        public void Innermethod(){
            System.out.println("This is the inner class.");

        }
    }
    public void displayinner(){
        InnerClass inner= new InnerClass();
        inner.Innermethod();
    }
    public static void main(String[] args){
        OuterClass outer =new OuterClass();
        OuterClass.InnerClass obj1= outer.new  InnerClass();
        obj1.Innermethod();//calling inner class method
        System.out.println("This another way of object creation:");
        outer.displayinner();
    }
}
