class Solution {
    public boolean canJump(int[] nums) {
        int maxreachable=0;

        for(int i=0;i<nums.length;i++){
            if(maxreachable<i){
                return false;
            }

            maxreachable=Math.max(maxreachable,i+nums[i]);
        }

        return true;
    }
}