/*
 * ProgramID : Number_Triangular
 * Author : Aditya Sinha
 * Description : Number Triangle Pattern Printing
 * Date : 5/2/26
 * */

import java.util.Scanner;
public class Number_Triangular{
    public static void solution(int rows){
        for(int i=1; i<=rows; i++){
            //Calculate the Gaps
            for(int k=rows-i; k>0; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int rows = scn.nextInt();

        solution(rows);
        scn.close();
    }
}
