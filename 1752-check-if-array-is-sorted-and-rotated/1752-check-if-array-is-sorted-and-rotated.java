class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        if(n==1 || n==2)
        return true;

        int count=0;
        for(int i=0;i<n-1;i++){
            if(nums[i+1]>=nums[i])
            count++;
        }

        if(count<n-2)
        return false;

        else if(count==n-1)
        return true;

        else if(nums[n-1]>nums[0])
        return false;

        return true;


    }
}