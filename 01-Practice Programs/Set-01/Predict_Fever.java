/*
 * ProgramID : Predict_Fever
 * Author : Aditya Sinha
 * Description : Predict Fever based on Logic
 * Date : 2/1/26
 * */
import java.util.Scanner;
public class Predict_Fever {
    public static void main(String[] args){
        System.out.print("Enter Your Temperature : ");

        Scanner scn = new Scanner(System.in);
        double temp = scn.nextDouble();

        if(temp > 100.00){
            System.out.print("You Have Fever...");
        }
        else{
            System.out.print("You Don't Have Fever...");
        }

        scn.close();
    }
}
