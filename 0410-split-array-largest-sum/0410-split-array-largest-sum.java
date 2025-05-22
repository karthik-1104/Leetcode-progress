class Solution {
    public int splitArray(int[] nums, int k) {
        int low=getMax(nums);
        int high=getSum(nums);

        while(low<high){
            int mid=low+(high-low)/2;

            if(canSplit(nums,k,mid)){
              high=mid;
            }
            else{
               low=mid+1;
            }
        }

        return low;
    }

    public static boolean canSplit(int[] nums,int k,int largestSum){
        int currSum=0;
        int m=1;

        for(int number:nums){

            if(currSum+number>largestSum){
                m++;
                currSum=0;
            }
            currSum+=number;
        }

        if(m<=k) return true;
        return false;
    }
    public static int getMax(int[] nums){

        int max=nums[0];
        for(int number: nums){
            max=Math.max(number,max);
        }

        return max;
    }

    public static int getSum(int[] nums){
        int sum=0;

        for(int number: nums){
            sum+=number;
        }

        return sum;
    }


}