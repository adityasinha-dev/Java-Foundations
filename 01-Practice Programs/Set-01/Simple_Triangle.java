/*
 * ProgramID : Simple_Triangle
 * Author : Aditya Sinha
 * Description : Simple Triangle Pattern Printing
 * Date : 5/2/26
 * */
import java.util.Scanner;
public class Simple_Triangle {
    public static void solution(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i ; j++){
                System.out.print("* ");
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
