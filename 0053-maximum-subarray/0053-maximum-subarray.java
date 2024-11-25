class Solution {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for(int num : nums){
            currentSum += num;
            result = Math.max(result, currentSum);
            if (currentSum < 0) {
                currentSum = 0; 
            }
        }
        return result;
    }
}