import java.io.*;
import java.util.*;

public class day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // create a scanner object to read from stdin
        Scanner scan = new Scanner(System.in);
        // create an integer for number of cases
        int T = scan.nextInt();
        // create a string to hold each case
        String givenString = "";
        // create a char array
        char[] currentChar = {};

        for(int i = 0; i < T; i++)  // loop over each input
        {
            givenString = scan.next();    // read each input as string
            currentChar = givenString.toCharArray();    // make an array out of string
            for(int j = 0; j < 2; j++)  // starting point of loops (0 for even, 1 for odd)
            {
                for(int k = j; k < givenString.length(); k += 2)  // loop over indicies
                {
                    System.out.print(currentChar[k]); // print the corresponding index
                }
                System.out.print(" ");  // separate by a space
            }
            System.out.println(""); // add a new line to separate next input
        }

    }
}
