package Exception;

import java.util.Scanner;
public class CustomException {
    public static void validate(int age) throws AgeValidationException{
            if(age<18){
                throw new AgeValidationException("Under age, not valide to vote");
            }else{
                System.out.println("You are eligible to vote");
            }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age= sc.nextInt();

        try{
            validate(age);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
