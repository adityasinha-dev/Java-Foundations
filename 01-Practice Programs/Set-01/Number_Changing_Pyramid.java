/*
 * ProgramID : Number_Changing_Pyramid
 * Author : Aditya Sinha
 * Description : Number Changing Pyramid Pattern
 * Date : 5/2/26
 * */

import java.util.Scanner;
public class Number_Changing_Pyramid {
    public static void solution(int rows){
        int buffer=1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++,buffer++){
                System.out.print(buffer+" ");
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
