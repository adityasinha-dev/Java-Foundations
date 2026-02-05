//Taking String Input
/*
 * ProgramID : String_Inputs
 * Author : Aditya Sinha
 * Description : Taking String Inputs
 * Date : 2/1/26
 * */

import java.util.Scanner;
public class String_Inputs {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = scn.nextLine();
        System.out.print(name);

        scn.close();
    }
}
