/* https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0 */
import java.util.*;
public class SubarraySum{
    public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		String res[] = new String[cases];
		int j = 0;
		while(cases-- > 0){
		    int length = in.nextInt();
		    int sum = in.nextInt();
		    int arr[] = new int[length];
		    for(int i=0; i<length; i++){
		        arr[i] = in.nextInt();
		    }
		    res[j++] = subArrays(arr, sum);
		}
		for(int i=0; i< res.length; i++){
		    System.out.println(res[i]);
        }
        in.close();
	}
	
	public static String subArrays(int arr[], int sum){
	    int sum_arr = arr[0];
	    int start = 0;
	    if(sum_arr == sum){
	        return "1 1";
	    }
	    for(int i=1; i<arr.length; i++){
	        sum_arr += arr[i];
	        while(sum_arr > sum){
	            sum_arr -= arr[start++];
	        }
	        if(sum_arr == sum){
	            return (start+1) + " " + (i+1);
	        }
	    }
	    return "-1";
	}
}