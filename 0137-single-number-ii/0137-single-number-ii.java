class Solution {
    public int singleNumber(int[] nums) {
        int curr=0,count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[curr]==nums[i])
            count++;

            if(count==3){
                i=0;
                count=1;
                curr++;
            }
        }

        return nums[curr];
    }
}