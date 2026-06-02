class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0,window=0;
        for(int i=0;i<k;i++) {
            window+=nums[i];
        }
        ans=window/k;
        for(int i=k;i<nums.length;i++) {
            window+=nums[i]-nums[i-k];
            ans=Math.max(ans,window/k);
        }
        return ans;
    }
}