import java.util.Scanner;

//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Feb 12 2019       --
//-- Created for:    Unit 1-07         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------


public class wood {

    public static float boardFoot(float length, float width) { // Define boardFoot function
        float output = ( length * width ) / 144;
        return output;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Please enter the length:");
        float userLength = scanner.nextInt();

        System.out.println("Hello! Please enter the width:");
        float userWidth = scanner.nextInt();

        System.out.println(boardFoot(userLength, userWidth));

        scanner.close();
    }
}