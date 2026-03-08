/*
* ProgramID : Descending_Order
* Author : Aditya Sinha
* Description : Print 5 Numbers in Descending Order
* Date : 8/03/26
* */

import java.util.Scanner;
public class Descending_Order{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);//Object Creation

        int[] arr1 = new int[5]; //Array Declaration

        //Taking User Inputs
        System.out.print("Enter 5 Numbers : ");
        for(int i=0; i<5; i++){
            int num = scn.nextInt();
            arr1[i] = num;
        }

        //Sorting in Descending Order
        for(int i=1; i<5; i++){
            for(int j=0; j < 5-i; j++){
                if(arr1[j] < arr1[j+1]){
                    int buffer = arr1[j];
                    arr1[j]= arr1[j+1];
                    arr1[j+1]=buffer;
                }
            }
        }

        //Printing the Output
        System.out.print("Descending Order : ");
        for(int i=0; i<5; i++){
            System.out.print(arr1[i]+" ");
        }

        scn.close(); //Scanner Object Closing
    }
}

