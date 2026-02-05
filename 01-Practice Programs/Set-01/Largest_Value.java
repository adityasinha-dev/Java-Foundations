/*
 * ProgramID : Largest_Value
 * Author : Aditya Sinha
 * Description : Print Largest Value among 3 Numbers
 * Date : 25/1/25
 * */
import java.util.Scanner;
public class Largest_Value {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = scn.nextInt();

        System.out.print("Enter Number 2 : ");
        int num2 = scn.nextInt();

        System.out.print("Enter Number 3 : ");
        int num3 = scn.nextInt();

        //Conditions
        if(num1 > num2){
            if(num1>num3){
                System.out.print("The Greatest Value : "+num1);
            }
            else{
                System.out.print("The Greatest Value : "+num3);
            }
        }
        else{
            if(num2>num3){
                System.out.print("The Greatest Value : "+num2);
            }
            else{
                System.out.print("The Greatest Value : "+num3);
            }
        }
    }

}
