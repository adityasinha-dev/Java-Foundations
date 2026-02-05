/*
 * ProgramID : Positive_Negative
 * Author : Aditya Sinha
 * Description : Determine Positive or Negative Values
 * Date : 2/1/26
 * */
import java.util.Scanner;
public class Positive_Negative {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number to Check : ");
        int num = scn.nextInt();

        if(num>0){
            System.out.print("The Number is Positive...");
        }
        else{
            System.out.print("The Number is Negative...");
        }

    }
}
