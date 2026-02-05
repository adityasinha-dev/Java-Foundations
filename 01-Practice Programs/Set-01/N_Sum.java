/*
 * ProgramID : N_Sum
 * Author : Aditya Sinha
 * Description : Sum of First N Natural Numbers
 * Date : 2/2/26
 * */
import java.util.Scanner;
public class N_Sum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = scn.nextInt();

        int result=0;

        for(int i=1; i<=num; i++){
            result += i;
        }

        System.out.print("Result : "+result);
    }
}
