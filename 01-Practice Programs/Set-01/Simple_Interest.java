/*
 * ProgramID : Arithmetic_Operations
 * Author : Aditya Sinha
 * Description : Calculating Simple Interest
 * Date : 3/2/26
 * */

import java.util.Scanner;
public class Simple_Interest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        int pri = scn.nextInt();

        System.out.print("Enter Time Duration : ");
        int time = scn.nextInt();

        System.out.print("Enter Rate of Interest : ");
        float r = scn.nextFloat();

        //Calculating Simple Interest
        float SI = (pri*time*r)/100;
        System.out.print("Simple Interest : "+SI);

        scn.close();

    }
}
