class Solution {
    public int majorityElement(int[] nums) {
        int freq=0,maxi=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                freq++;
            }

            if(freq>=(nums.length/2)){
                maxi=nums[i];
                 break;
            }
            
        }

        return maxi;
    }
}