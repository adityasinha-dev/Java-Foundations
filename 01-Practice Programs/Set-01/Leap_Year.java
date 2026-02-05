/*
 * ProgramID : Leap_Year
 * Author : Aditya Sinha
 * Description : Predict Leap Years
 * Date : 28/1/26
 * */
import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = scn.nextInt();

        boolean result = false;

        //Conditions
        if(year%4 ==0){
            result=true;

            if(year%100 == 0){
                if(year%400 == 0){
                    result = true;
                }
                else{
                    result = false;
                }
            }
        }
        else{
            result = false;
        }

        if(result){
            System.out.print("It's a Leap Year...");
        }
        else{
            System.out.print("It's not a Leap Year...");
        }

        scn.close();
    }
}
