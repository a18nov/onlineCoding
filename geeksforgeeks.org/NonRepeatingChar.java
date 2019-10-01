import java.util.*;
public class NonRepeatingChar{
    public static void main(String[] args){
        int res = nonRepeatChar("geeksforgeeks");
        System.out.println(res > 0 ? (char)res : "All are repeating Characters!");
    }

    public static int nonRepeatChar(String str){
        int res = -1;
        str = str.toUpperCase();
        int char_vals[] = new int[26];
        for(int i = 0; i < str.length(); i++){
            char_vals[((int)str.charAt(i)) - 65]++;
        }
        for(int i = 0; i < str.length(); i++){
            if(char_vals[((int)str.charAt(i)) - 65] == 1){
                return (int)str.charAt(i);
            }
        }
        return res;
    }
}