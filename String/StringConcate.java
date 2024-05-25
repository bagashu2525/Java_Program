package String;
import java.util.Scanner;
public class StringConcate {
    static void calulateCapital(String s){
        System.out.println("The index of capital letters in the above string are : ");
        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                System.out.println(i+" -> "+s.charAt(i));
            }    
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a String1: ");
        String strng1 = sc.nextLine();
        System.out.println("Enetr a String2: ");
        String strng2 = sc.nextLine();

        //string concatenation
        String newConcate = strng1.concat(strng2);
        System.out.println("The Concated String is : "+newConcate);
        calulateCapital(newConcate);
        sc.close();

    }
}
