/*
 * ProgramID : Zero_One_Pattern
 * Author : Aditya Sinha
 * Description : Zero One Pattern Printing Program
 * Date : 5/2/26
 * */

import java.util.Scanner;
public class Zero_One {
    public static void solutions(int rows){
        int Buffer = 1;
        for(int i=1; i<=rows; i++){
            if(i%2!=0){
                for(int j=1; j<=i; j++){
                    if(j%2 != 0){
                        Buffer=1;
                        System.out.print(Buffer+" ");
                        Buffer=0;
                    }
                    else{
                        System.out.print(Buffer+" ");
                        Buffer=1;
                    }
                }
                System.out.print("\n");
            }
            else{
                for(int k=1; k<=i; k++){
                    if(k%2 != 0){
                        Buffer=0;
                        System.out.print(Buffer+" ");
                        Buffer=1;
                    }
                    else{
                        System.out.print(Buffer+" ");
                        Buffer=0;
                    }
                }
                System.out.print("\n");
            }
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int rows = scn.nextInt();

        solutions(rows);
        scn.close();

    }
}
