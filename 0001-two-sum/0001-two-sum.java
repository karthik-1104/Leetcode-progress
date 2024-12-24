class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum[]=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]==target-nums[i])
                {
                    sum[0]=i;
                    sum[1]=j;
                    
                }
            }
        }

        return sum;
    }
}