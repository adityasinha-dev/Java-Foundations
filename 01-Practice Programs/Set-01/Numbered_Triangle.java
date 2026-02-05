/*
 * ProgramID : Numbered_Triangle
 * Author : Aditya Sinha
 * Description : Number Triangle Pattern Printing
 * Date : 5/2/26
 * */
import java.util.Scanner;
public class Numbered_Triangle{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int rows = scn.nextInt();
        int buffer=1;

        while(rows>0){
            int gaps = rows-1;
            int count = buffer;
            while(gaps>0){
                System.out.print(" ");
                gaps--;
            }
            while(count>0){
                System.out.print(buffer+" ");
                count--;
            }
            System.out.print("\n");

            buffer+=1;
            rows--;
        }
        scn.close();
    }
}