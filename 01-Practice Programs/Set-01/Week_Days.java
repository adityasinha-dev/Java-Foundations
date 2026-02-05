/*
 * ProgramID : Week_Days
 * Author : Aditya Sinha
 * Description : Print Week Days Demonstrate Switch-Case
 * Date : 2/2/26
 * */
import java.util.Scanner;
public class Week_Days {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Choice (1-7) : ");
        int choice = scn.nextInt();

        switch(choice){
            case 1:
                System.out.print("Monday");
                break;

            case 2:
                System.out.print("Tuesday");
                break;

            case 3:
                System.out.print("Wednesday");
                break;

            case 4:
                System.out.print("Thursday");
                break;

            case 5:
                System.out.print("Friday");
                break;

            case 6:
                System.out.print("Saturday");
                break;

            case 7:
                System.out.print("Sunday");
                break;

            default:
                System.out.print("Invalid Input Passed...");

        }
        scn.close();
    }
}
