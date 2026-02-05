/*
 * ProgramID : Number_Products
 * Author : Aditya Sinha
 * Description : Demonstrating Product of 2 Numbers User Input
 * Date : 2/1/26
 * */
import java.util.Scanner;
public class Number_Products {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in); //Creating Scanner Object
        System.out.print("Enter Number 1 : ");
        int num1 = scn.nextInt();

        System.out.print("Enter Number 2 : ");
        int num2 = scn.nextInt();

        int product = num1 * num2 ; //Calculating Product
        System.out.print("Result : "+product);
        scn.close();

    }


}
