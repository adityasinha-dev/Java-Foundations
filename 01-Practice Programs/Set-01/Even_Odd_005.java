/*
 * ProgramID : Even_Odd_005
 * Author : Aditya Sinha
 * Description : Predict the Number is Odd or Even
 * Date : 23/1/26
 * */

import java.util.Scanner;
public class Even_Odd_005 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Number to Check : ");
        int num = scn.nextInt();

        //Condition
        if(num%2 == 0){
            System.out.print("The Number is Even...");
        }
        else{
            System.out.print("The Number is Odd..");
        }

    }
}
