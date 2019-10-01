/*https://www.geeksforgeeks.org/minimum-length-subarray-sum-greater-given-value/*/
import java.util.*;
public class SmallestSubArraySum{
    public static void main(String[] args){
        int arr[] = {1, 10, 5, 2, 7};
        int res = minLength2(arr, 5, 9);
        System.out.println(res);
    }

    public static int minLength(int arr[], int n, int x){       //O(n2)
        int sum = 0;
        int min_len = 0;
        for(int i = 0; i < n; i++){
            sum = arr[i];
            if(sum > x){
                return 1;
            }
            for(int j = i+1; j < n; j++){
                sum += arr[j];
                if(sum > x){
                    min_len = j-i;
                    break;
                }
            }
        }
        return min_len;
    }

    public static int minLength2(int arr[], int n, int x){      //O(n)
        int curr_sum = 0, min_len = n+1;
        int start = 0, end = 0;
        while(end < n){
            while(curr_sum <= x && end < n){
                curr_sum += arr[end++];
            }
            while(curr_sum > x && start < n){
                if(end - start < min_len){
                    min_len = end - start;
                }
                curr_sum -= arr[start++];
            }
        }
        return min_len;
    }
}