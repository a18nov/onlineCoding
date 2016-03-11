import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class VeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0;
        int n = in.nextInt();
        long arr[] = new long[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextLong();
            sum = sum + arr[arr_i];
        }
        System.out.print(sum);
    }
}