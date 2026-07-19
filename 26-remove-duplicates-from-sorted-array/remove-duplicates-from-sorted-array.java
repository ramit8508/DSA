class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int off = 0;
        int unique = 1;
        int cm= 1;
        while(cm < nums.length){
            if(nums[cm] == nums[cm-1]){
                cm++;
                continue;
            }
            nums[++off] = nums[cm];
            unique++;
            cm++;
        }
        return unique;
    }
}