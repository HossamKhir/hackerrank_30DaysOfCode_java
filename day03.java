import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day03 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // check if N is even
        if((N % 2) == 0)
        {
            // check if N is in [2,5] or ]20,inf[
            if((N > 20) || ((N >= 2) && (N <= 5)))
            {
                System.out.println("Not Weird");
            }
            else    // N is in [6,20]
            {
                System.out.println("Weird");
            }
        }
        else    // N is odd
        {
            System.out.println("Weird");
        }
        scanner.close();
    }
}
