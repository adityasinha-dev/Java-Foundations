/*
 * ProgramID : ASCII_Values
 * Author : Aditya Sinha
 * Description : Calculating ASCII Values of Characters
 * Date : 27/1/26
 * */

import java.util.Scanner;
public class ASCII_Values{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char val = scn.next().charAt(0);

        //Converting to ASCII
        int result = val;
        System.out.print("ASCII Value : "+result);
    }

}