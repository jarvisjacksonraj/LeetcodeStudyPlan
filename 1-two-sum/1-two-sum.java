class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Define HashMap
        HashMap<Integer,Integer> targetMap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(targetMap.containsKey(diff)) {
                return new int[]{i, targetMap.get(diff)};
            }
            targetMap.put(nums[i], i);
        }
        
        return new int[]{-1, -1};
    }
}