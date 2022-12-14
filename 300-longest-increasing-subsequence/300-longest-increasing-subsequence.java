class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        
        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j]<nums[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }                                 
            }  
        }
        int max = Integer.MIN_VALUE;
        for(int d : dp) {
            max = Math.max(d, max);
        }
        
        return max;
    }
}