public class StaticMethod {
    public static void main(String[] args){
        Vehicle car= new Vehicle("Fortuner", 10000000);
        System.out.println("This the details of car\n"+car);
        Vehicle bike= new Vehicle("Bullet", 230400);
        //change the static variable by static method
        Vehicle.changeType(1);
        System.out.println("This the details of bike\n"+bike);
    }
}
