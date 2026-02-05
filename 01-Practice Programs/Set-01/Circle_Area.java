/*
 * ProgramID : Circle_Area
 * Author : Aditya Sinha
 * Description : Calculate Area of Circle
 * Date : 2/1/26
 * */
import java.util.Scanner;
public class Circle_Area {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Circle Radius : ");
        float radius = scn.nextFloat();

        double PII = 3.14;
        double circle_area = (PII*(radius*radius));

        System.out.print("Area of Circle : "+circle_area);
        scn.close();
    }
}
