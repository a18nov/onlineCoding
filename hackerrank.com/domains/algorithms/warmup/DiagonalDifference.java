import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        int rSum=0,lSum=0,total=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                if(i==j){
                    rSum=rSum+a[i][j];
                }
                if(i+j==(n-1)){
                    lSum=lSum+a[i][j];
                }
            }
        }
        total=rSum-lSum;
        if(total<0)
            total*=-1;
        System.out.println(total);
    }
}
