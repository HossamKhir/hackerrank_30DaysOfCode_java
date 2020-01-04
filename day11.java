import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day11 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int maxSum = - 0x8000, sum = - 0x8000;
        for (int row = 0; row <= 3; row++)
        {
            for(int col = 0; col <= 3; col++)
            {
                sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] +
                        arr[row + 1][col + 1] +
                        arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
                maxSum = (sum >= maxSum)? sum : maxSum;
            }
        }

        System.out.println(maxSum);

        scanner.close();
    }
}