import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int[] merge = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
                      .toArray();
                      Arrays.sort(merge);
        int n = merge.length;
        double median = 0;
        if(n % 2 !=0){
            return merge[n/2];
        }
        else{
            return ((merge[n/2 - 1] + merge[n/2 ]) / 2.0);
        }

    }
}