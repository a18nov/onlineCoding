import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,x,l=1;
        int n = in.nextInt();
        x=n;
        for(i=0;i<n;i++){
            for(j=0;j<x-1;j++){
                System.out.print(" ");
            }
            x--;
            for(j=0;j<l;j++){
                System.out.print("#");
            }
            l++;
            System.out.println();
        }
    }
}
