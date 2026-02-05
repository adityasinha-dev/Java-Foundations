/*
 * ProgramID : Prime_Check
 * Author : Aditya Sinha
 * Description : Prime Number Check Positive & Negative Integers
 * Date : 31/1/26
 * */
import java.util.Scanner;
public class Prime_Check {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = scn.nextInt();
        int clock=0;

        if(num>2){
            int buffer=2;
            while(buffer<num){
                if(num%buffer == 0){
                    clock = 1;
                    break;
                }
                buffer+=1;
            }
        }
        else if(num==2){
            clock=0;
        }
        else if(num<2){
            if (num ==0){
                System.out.print("Zero is Neither Prime nor Composite");
                clock = -1;
            }
            else if(num == 1 || num == -1){
                clock =1;
            }
            else{
                int nbuffer = -2;
                while(nbuffer>num){
                    if(num%nbuffer ==0){
                        clock = 1;
                        break;
                    }
                    nbuffer -=1;
                }
            }
        }
        else{
            System.out.print("Invalid Input....");
        }

        if(clock ==1){
            System.out.print(num+" Not Prime Number...");
        }
        else if(clock == 0){
            System.out.print(num+" Prime Number...");
        }
        scn.close();
    }
}
