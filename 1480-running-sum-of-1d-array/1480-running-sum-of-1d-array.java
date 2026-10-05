class Solution {
    public int[] runningSum(int[] nums) {
        int i = 1, n = nums.length;
        while(i<n){
            nums[i] = nums[i-1] + nums[i];
            i++;
        }
        return nums;
    }
}