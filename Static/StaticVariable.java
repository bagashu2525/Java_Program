/*Static variable can be used to refer the common property of all objects
 * 
 * Static variables gets memory only once in the class area at the time of class loading
 */

 public class StaticVariable{
    static int counter;
    int x;
    static int z;
    StaticVariable(){
        counter++;
    }
    public static void main(String [] args){
        StaticVariable sv1= new StaticVariable();
        StaticVariable sv2= new StaticVariable();
        //the static variable is used to count the number of objects created against a class
        
        System.out.println("The Counter value: "+counter);
        //since counter is static, it can be called without object specification within the same class
        sv1.x=10; sv1.z=10;
        System.out.println("The Variable value for object 1 x= "+sv1.x+" z= "+sv1.z);
        
        sv2.x=20; sv2.z=20;
        System.out.println("The Variable value for object 2 x= "+sv2.x+" z= "+sv2.z);

        System.out.println("\n\nNow after the value of z for object 2 the z value of object 1 changes since the static variable is shared over the objects");

        System.out.println("\nThe Variable value for object 1 x= "+sv1.x+" z= "+sv1.z);
        System.out.println("The Variable value for object 2 x= "+sv2.x+" z= "+sv2.z);

    }
 }