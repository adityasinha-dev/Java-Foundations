/*
* ProgramID : Input_Value_002
* Author : Aditya Sinha
* Description : Demonstrating User Input and Custom Output Values
* Date : 22/10/25
* */

import java.util.Scanner;
public class User_Input {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in); //Scanner Object Creation
        System.out.print("Enter Your Name : ");
        String val =scn.nextLine(); //Storing String Input
        System.out.println("Hi,"+val+" Welcome Back to the World..."); //Final Output

    }
}
