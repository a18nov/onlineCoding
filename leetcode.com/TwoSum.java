public class TwoSum{
    public static void main(String[] args){
        /**Given an array of integers, return indices of the two numbers such that they add up to a specific target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        Example:
            Given nums = [2, 7, 11, 15], target = 9,
            Because nums[0] + nums[1] = 2 + 7 = 9,
            return [0, 1]. */
    }
    //O(n^2)
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int k = 1; k< nums.length; k++){
                if(nums[i] + nums[k] == target && (i != k)){
                    return new int[]{ i, k };
                }
            }
        }
        throw new IllegalArgumentException("No Solution");
    }
    //O(n)
    public int[] twoSumAdvanced(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i){
                return new int[] { i, map.get(target - nums[i])};
            }
        }
        throw new IllegalArgumentException("No Solution");
    }
}