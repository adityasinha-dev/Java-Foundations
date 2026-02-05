/*
 * ProgramID : Hollow_Square
 * Author : Aditya Sinha
 * Description : Hollow Square Pattern Printing
 * Date : 5/2/26
 * */
import java.util.Scanner;
public class Hollow_Square{
    public static void square(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows; j++){
                if(i==1 || i==rows || j==1 || j==rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int rows = scn.nextInt();

        square(rows);
        scn.close();
    }
}