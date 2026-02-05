/*
 * ProgramID : Income Tax
 * Author : Aditya Sinha
 * Description : Income Tax Calculator
 * Date : 26/1/26
 * */

import java.util.Scanner;
public class Income_Tax {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);//Scanner Object Creation

        System.out.print("Enter Your Salary : ");
        int income = scn.nextInt();

        int tax;
        //Conditions
        if(income < 500000){
            tax = (int) (income*0.05f);
        }
        else if(income < 1000000){
            tax = (int) (income*0.2f);
        }
        else{
            tax = (int) (income*0.3f);
        }

        System.out.print("Your Income Tax : "+tax+"\n");
        System.out.print("In-Hand Salary : "+(income-tax));

    }
}
