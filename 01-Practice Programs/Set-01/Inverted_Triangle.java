/*
 * ProgramID : Inverted Triangle
 * Author : Aditya Sinha
 * Description : Demonstrating Pattern Printing (Inverted Triangle)
 * Date : 2/2/26
 * */

import java.util.Scanner;
public class Inverted_Triangle {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Lines : ");
        int num = scn.nextInt();

        for(int i = num; i>0; i--){
            int buffer=i;
            while(buffer>0){
                System.out.print("* ");
                buffer-=1;
            }
            System.out.print("\n");
        }
        scn.close();

    }
}
