class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1;
        int suff = 1;
       int[] arr = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){ 
             arr[i]= pre;
             pre *= nums[i];
        }
        for(int i = nums.length - 1 ; i >= 0; i--){
            arr[i] *= suff;
            suff *= nums[i];
        }
        return arr;
    }
}