import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day10 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int ones = 0, maxOnes = 0;

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        char[] u8Occur = Integer.toBinaryString(n).toCharArray();
        for(int i = 0; i < u8Occur.length; i++)
        {
            if(u8Occur[i] == '1')
            {
                ones += 1;
            }
            else
            {
                maxOnes = (ones >= maxOnes)? ones : maxOnes;
                ones = 0;
            }
        }

        maxOnes = (ones >= maxOnes)? ones : maxOnes;

        System.out.println(maxOnes);

        scanner.close();
    }
}
