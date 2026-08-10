
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close = Integer.MAX_VALUE / 2;
        for(int i = 0 ; i < nums.length ; ++i){
            int left = i + 1; 
            int right = nums.length - 1;
        while(left < right){
            int current_sum = nums[i] + nums[left] + nums[right];
            if (Math.abs(current_sum - target) < Math.abs(close - target)) {
                    close = current_sum;
            }
            if (current_sum < target) {
                ++left;
                } 
                else if (current_sum > target) {
                --right;
                } 
                else {
                    return current_sum;
                }
        }

        }
        return close;

    }
}   