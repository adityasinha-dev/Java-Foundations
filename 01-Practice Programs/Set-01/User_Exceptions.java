/*
 * ProgramID : User_Exceptions
 * Author : Aditya Sinha
 * Description : Demonstrating User Defined Exceptions
 * Date : 30/1/26
 * */
import java.util.Scanner;

class AgeExceptions extends Exception{
    AgeExceptions(String Message){
        super(Message);
    }
}

public class User_Exceptions{
    static void checkage(int age) throws AgeExceptions {
        if(age < 18){
            throw new AgeExceptions("Age is Not Valid...");
        }
        else{
            System.out.print("Age is Valid...");
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = scn.nextInt();
        try{

            checkage(age);
        }
        catch(AgeExceptions e){
            System.out.print("Exception Caught : "+e.getMessage());
        }
        finally{
            System.out.print("\nCode Terminatted....");
        }
    }
}