public class Main {
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 ob = new Thread3();
        Thread t3 = new Thread(ob);

        t1.start();
        t2.start();
        t3.start();


        System.out.println("Hello World");
        // t1.setPriority(10);
        // t2.setPriority(1);
        // System.out.println(t1.getPriority());;
        // System.out.println(t2.getPriority());;
    }
}
