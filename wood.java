
//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Feb 12 2019       --
//-- Created for:    Unit 1-07         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------
//-- This program calculates any one of--
//-- the three dimensions of an abject --
//---------------------------------------

import java.util.Scanner;

public class wood {

    public static float boardFoot(float first, float second) { // Define boardFoot function
        float output = 144 / ( first * second ) ; // The formula is the same for all the dimensions
        return output;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Intro an instence of Scanner

        // Asking for and storing data:
        System.out.println("Which dimention do you want to solve for? \n(Please type --> length, width, or height)");
        String dimension = scanner.next();
        System.out.println("OK! Please enter the first dimension:");
        float userfirst = scanner.nextInt();
        System.out.println("OK! Please enter the other dimension:");
        float usersecond = scanner.nextInt();

        // Process and output (the last part rounds the number to 2 decimal places):
        System.out.println("the " + dimension + " of your object is approximately equal to: " + Math.round(boardFoot(userfirst, usersecond) * 100.0) / 100.0);

        scanner.close(); // Closing scanner to avoid warnings
    }
}