/*
 * ProgramID : Number_Products
 * Author : Aditya Sinha
 * Description : Bill Generating Program
 * Date : 2/1/26
 * */
import java.util.Scanner;
public class Bill_Creator {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Pencil Price : ");
        float pencil = scn.nextFloat();

        System.out.print("Enter Pen Price : ");
        float pen = scn.nextFloat();

        System.out.print("Enter Eraser Cost : ");
        float eraser = scn.nextFloat();

        //Bill
        float bill = (float) ((eraser+pen+pencil)*18)/100 + (eraser+pen+pencil);
        System.out.print("Total Bill : "+bill);

        scn.close();
    }
}
