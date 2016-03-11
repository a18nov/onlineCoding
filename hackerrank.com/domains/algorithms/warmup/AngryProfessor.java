import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int check=0,ans_t=0,i;
        int t = in.nextInt();
        String ans[] = new String[t];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(i=0; i < n; i++){
                a[i] = in.nextInt();
            }
            for(i=0;i<n;i++){
                if(a[i]<=0)
                    check++;
            }
            if(check>=k){
                ans[a0]="NO";
            }
            else{
                ans[a0]="YES";
            }
            check=0;
        }
        for(i=0;i<t;i++){
            System.out.println(ans[i]);
        }
    }
}
