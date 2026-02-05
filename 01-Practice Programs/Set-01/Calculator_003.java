
/*
 * ProgramID : Calculator_003
 * Author : Aditya Sinha
 * Description : Basic Arithmetic Calculator
 * Date : 22/1/26
 * */
import java.util.Scanner;
public class Calculator_003 {
    public static void addition(int num1, int num2){
        System.out.print("Result : "+(num1+num2));
    }

    public static void subtraction(int val1, int val2){
        System.out.print("Result : "+(val1-val2));
    }

    public static void multiplication(int num, int num1){
        System.out.print("Result : "+(num*num1));
    }

    public static void divison(int val, int val1){
        System.out.print("Result : "+(val/val1));
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\nEnter Your Choice : ");
        int choice = scn.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter Number 1 : ");
                int num1 = scn.nextInt();
                System.out.print("Enter Number 2 : ");
                int num2 = scn.nextInt();

                addition(num1,num2);
                break;

            case 2:
                System.out.print("Enter Number 1 : ");
                int n1 = scn.nextInt();
                System.out.print("Enter Number 2 : ");
                int n2 = scn.nextInt();

                subtraction(n1,n2);
                break;

            case 3:
                System.out.print("Enter Number 1 : ");
                int val1 = scn.nextInt();
                System.out.print("Enter Number 2 : ");
                int val2 = scn.nextInt();

                multiplication(val1,val2);
                break;

            case 4:
                System.out.print("Enter Number 1 : ");
                int v1 = scn.nextInt();
                System.out.print("Enter Number 2 : ");
                int v2 = scn.nextInt();

                divison(v1,v2);
                break;

            default:
                System.out.print("Invalid Input...");
        }
    }
}
