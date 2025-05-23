class Solution {
    public void sortColors(int[] nums) {
        int currIndex=0;
        int lastZeroIndex=-1;
        int firstTwoIndex=nums.length;

        while(currIndex<firstTwoIndex){

            if(nums[currIndex]==0){
                swap(nums,currIndex++,++lastZeroIndex);
            }

            else if(nums[currIndex]==2){
                swap(nums,currIndex,--firstTwoIndex);
            }

            else{
                currIndex++;
            }
        }

        System.out.print(Arrays.toString(nums));

    }

    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}