/*
 * ProgramID : Palindromic_Pattern
 * Author : Aditya Sinha
 * Description : Palindromic Number Pattern Printing
 * Date : 5/2/26
 * */

import java.util.Scanner;
public class Palindromic_Pattern {
    public static void solution(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            for(int k=i-1; k>0; k--){
                System.out.print(k+" ");
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
