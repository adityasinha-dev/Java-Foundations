/*
 * ProgramID : Student_Pass_Fail
 * Author : Aditya Sinha
 * Description : Checks a Student Pass or Fail based on Criteria
 * Date : 29/1/26
 * */
import java.util.Scanner;
public class Student_Pass_Fail {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        int marks = scn.nextInt();
        String result = (marks>=33 ? "PASS" : "FAIL"); //Ternary Operator Used
        System.out.print("Result : "+result);
        scn.close();
    }
}
