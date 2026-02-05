/*
 * ProgramID : Conditions_004
 * Author : Aditya Sinha
 * Description : Determine the User is Adult
 * Date : 22/1/26
 * */

import java.util.Scanner;

class Conditions_004 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in); //Object Creation
        System.out.print("Enter Your Age : ");//Handling User Input
        int age = scn.nextInt();

        //Conditions
        if(age >= 18){
            System.out.print("The User is Adult...");
        }
        else{
            System.out.print("The User is not Adult...");
        }
    }
}