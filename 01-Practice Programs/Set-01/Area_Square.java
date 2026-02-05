/*
 * ProgramID : Area_Square
 * Author : Aditya Sinha
 * Description : Calculating Area of Square
 * Date : 2/1/26
 * */

import java.util.Scanner;
public class Area_Square {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Side of Square : ");
        float side = scn.nextFloat();

        //Area of Square

        float area = side*side;
        System.out.print("Result : "+area);

        scn.close();
    }
}
