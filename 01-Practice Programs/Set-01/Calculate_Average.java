/*
 * ProgramID : Calculate_Average
 * Author : Aditya Sinha
 * Description : Calculate Average Marks in Various Exams
 * Date : 2/1/26
 * */

import java.util.Scanner;
public class Calculate_Average {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("How Many Exams to Compare : ");
        int size = scn.nextInt();
        int[] list1= new int[size];

        for(int i=0; i<size; i++){
            int marks;
            System.out.print("Enter Marks : ");
            marks = scn.nextInt();

            list1[i]=marks;
        }

        int sum=0;

        for(int j=0; j<size; j++){
            sum += list1[j];
        }

        int result=sum/size;
        System.out.print("Average Marks Obtained : "+result);

        scn.close();

    }
}
