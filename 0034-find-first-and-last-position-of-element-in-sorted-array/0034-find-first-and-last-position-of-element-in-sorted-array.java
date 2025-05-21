class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int posArr[]=new int[2];
        int bound;

        posArr[0]=findPos(nums,target,true);
        posArr[1]=findPos(nums,target,false);

        return posArr;

    }

    public static int findPos(int[] arr,int target,boolean isFirst){

        int low=0,high=arr.length-1;
       
        int bound=-1;
        while(low<=high){
             int mid=low+(high-low)/2;
            if(arr[mid]==target){
                bound=mid;

                if(isFirst){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }  
            }

            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return bound;
    }
}