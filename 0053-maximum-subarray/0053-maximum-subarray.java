class Solution {
    public int maxSubArray(int[] nums) {
        int currentMax=nums[0],maxSofar=nums[0];

        for(int i=1;i<nums.length;i++){
            currentMax=Math.max(currentMax,0)+nums[i];

            maxSofar=Math.max(maxSofar,currentMax);
        }

        return maxSofar;
    }
}