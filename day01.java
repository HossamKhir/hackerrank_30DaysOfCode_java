import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int u16Integer = 0;
        double s32Double = 0.0;
        String sString = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        u16Integer = scan.nextInt();
        s32Double = scan.nextDouble();
        sString = scan.nextLine();
        scan.reset();
        sString = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + u16Integer);

        /* Print the sum of the double variables on a new line. */
		System.out.println(d + s32Double);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
            System.out.println(s + sString);

        scan.close();
