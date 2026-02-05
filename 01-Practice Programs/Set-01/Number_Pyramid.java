/*
 * ProgramID : Number_Pyramid
 * Author : Aditya Sinha
 * Description : Number Increasing Pyramid Pattern
 * Date : 5/2/26
 * */

import java.util.Scanner;
public class Number_Pyramid {
    public static void pattern(int rows){
        for(int i=1; i<=rows; i++){
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number of Rows :");
        int rows = scn.nextInt();

        pattern(rows);
        scn.close();
    }
}
