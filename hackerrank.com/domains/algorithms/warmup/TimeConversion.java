import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion{
    public static void main(String[] args) {
        int i,x;
        char ch;
        String cTime;
        Scanner in = new Scanner(System.in);
        String time = in.next();
        ch=time.charAt(8);
        cTime=time.substring(0,2);
        if(ch=='P'){
            x=Integer.parseInt(cTime);
            if(!(Integer.parseInt(time.substring(0,2))==12)){
                x+=12;
                cTime=x+"";
                cTime=cTime+time.substring(2,8);
                System.out.print(cTime);
            }
            else{
                System.out.print(time.substring(0,8));
            }
        }
        else{
            if(!(Integer.parseInt(time.substring(0,2))==12))
                System.out.print(time.substring(0,8));
            else{
                cTime="00"+time.substring(2,8);
                System.out.print(cTime);
            }
        }
    }
}