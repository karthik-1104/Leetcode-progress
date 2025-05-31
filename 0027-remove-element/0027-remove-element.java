class Solution {
    public int removeElement(int[] nums, int val) {
        
        int valIndex=-1,count=0;

        for(int i=0;i<nums.length;i++){
             if(nums[i]!=val){
                nums[++valIndex]=nums[i];
                count++;
            }
        }

        return count;
    }
}