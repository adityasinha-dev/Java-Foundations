/*
 * ProgramID : Arithmetic_Operations
 * Author : Aditya Sinha
 * Description : Demonstrating Java Arithmetic Operators
 * Date : 2/2/26
 * */

import java.util.Scanner;
public class Arithmetic_Operations {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        operations op = new operations();

        System.out.print("1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\nEnter Your Choice : ");
        int choice = scn.nextInt();

        if(choice == 1){
            op.addition(scn);
        }
        else if(choice == 2){
            op.subtraction(scn);
        }
        else if(choice == 3){
            op.multiplication(scn);
        }
        else if(choice == 4){
            op.divison(scn);
        }
        else if(choice == 5){
            op.mudolo(scn);
        }
        else{
            System.out.print("Invalid Input...");
        }
        scn.close();

    }
}

class operations{
    public void addition(Scanner scn){
        System.out.print("Enter Number 1 : ");
        int val1 = scn.nextInt();

        System.out.print("Enter Number 2 : ");
        int val2 = scn.nextInt();

        System.out.print("Result : "+(val1+val2)+"\n");

    }

    public void subtraction(Scanner scn){
        System.out.print("Enter Number 1 : ");
        int val1 = scn.nextInt();

        System.out.print("Enter Number 2 : ");
        int val2 = scn.nextInt();

        System.out.print("Result : "+(val1-val2)+"\n");
    }

    public void multiplication(Scanner scn){
        System.out.print("Enter Number 1 : ");
        int val1 = scn.nextInt();

        System.out.print("Enter Number 2 : ");
        int val2 = scn.nextInt();

        System.out.print("Result : "+(val1*val2)+"\n");

    }

    public void divison(Scanner scn){

        System.out.print("Enter Number 1 : ");
        int val1 = scn.nextInt();

        System.out.print("Enter Number 2 : ");
        int val2 = scn.nextInt();

        System.out.print("Result : "+(val1/val2)+"\n");

    }

    public void mudolo(Scanner scn){

        System.out.print("Enter Number 1 : ");
        int val1 = scn.nextInt();

        System.out.print("Enter Number 2 : ");
        int val2 = scn.nextInt();

    }
}
