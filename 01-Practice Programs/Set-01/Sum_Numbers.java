/*
 * ProgramID : Sum_Numbers
 * Author : Aditya Sinha
 * Description : Adding Two Numbers User Input
 * Date : 22/1/26
 * */
import java.util.Scanner;
public class Sum_Numbers {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = scn.nextInt();

        System.out.print("Enter Number 2 : ");
        int num2 = scn.nextInt();

        int sum = num1+num2; //Calculating the Sum
        System.out.print("Result : "+sum);
        scn.close();
    }
}
