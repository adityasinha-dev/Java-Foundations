/*
 * ProgramID : Data_Types
 * Author : Aditya Sinha
 * Description : Exploring Datatypes
 * Date : 24/1/26
 * */
import java.util.Scanner;
public class Data_Types {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //Byte
        System.out.print("Enter Byte Type Data : ");
        Object val_0 = scn.nextByte();

        //short
        System.out.print("Enter Short Type Data : ");
        Object val1 = scn.nextShort();

        //int
        System.out.print("Enter Int Type Data : ");
        Object val2 = scn.nextInt();

        //long
        System.out.print("Enter Long Type Data : ");
        Object val3 = scn.nextLong();

        //Float
        System.out.print("Enter Float Type Data : ");
        Object val4 = scn.nextFloat();

        //Double
        System.out.print("Enter Double Type Data : ");
        Object val5 = scn.nextDouble();

        //Char
        System.out.print("Enter Char Type Data : ");
        Object val6 = scn.next().charAt(0);

        //String
        System.out.print("Enter One Word : ");
        Object val7 = scn.next();
        scn.nextLine();

        //String
        System.out.print("Enter one Line : ");
        Object val8 = scn.nextLine();

        //Boolean
        System.out.print("Enter Bool Value : ");
        Object val9 = scn.nextBoolean();
        //Outputs

        System.out.print("=================================\n");
        System.out.print("Variable 0 : "+val_0.getClass().getSimpleName()+"\n");
        System.out.print("Variable 1 : "+val1.getClass().getSimpleName()+"\n");
        System.out.print("Variable 2 : "+val2.getClass().getSimpleName()+"\n");
        System.out.print("Variable 3 : "+val3.getClass().getSimpleName()+"\n");
        System.out.print("Variable 4 : "+val4.getClass().getSimpleName()+"\n");
        System.out.print("Variable 5 : "+val5.getClass().getSimpleName()+"\n");
        System.out.print("Variable 6 : "+val6.getClass().getSimpleName()+"\n");
        System.out.print("Variable 7 : "+val7.getClass().getSimpleName());

    }

}
