public class Vehicle {
    String name;
    long price;
    static String type="four wheeler";

    static void changeType(int n){
        if(n==1)
            type="Two wheeler";
        else
            type="four wheeler";
    }

    Vehicle(String name, long price){
        this.name=name;
        this.price=price;
    }

    public String toString(){
        return this.name+" "+this.type+" "+this.price;
    }
}
