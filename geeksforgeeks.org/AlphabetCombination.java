/*Suppose a String  s=”kite”. We can represent it as “119205” by considering the position of each alphabet as it comes in A-Z(like 1 for A, 2 for B, …….., 11 for K and so on). But it is also possible that the string “119205” can be formed by the word “aaite” and “aste”.
So given a string of integer we have to find how many such words are possible.
Sample Input: “2112”
Output : 5

Explanation:

2112 can be represented as:

(2)(1)(1)(2) ->baab
(2)(1)(12) ->bal
(2)(11)(2)->bkb
(21)(1)(2)->uab
(21)(12)->ul */
import java.util.*;
public class AlphabetCombination{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(possibleCombinations(str));
        in.close();
    }

    public static int possibleCombinations(String str){
        int result = 0;
        str = str.toUpperCase();
        String numericValue = "";
        for(int i = 0; i < str.length(); i++){
            numericValue = numericValue + ((int)str.charAt(i) - 64);
        }
        for(int i = 0; i < numericValue.length(); i++){
            
            for(int j = i+1; j < numericValue.length(); j++){

            }
        }
        return result;
    }
}