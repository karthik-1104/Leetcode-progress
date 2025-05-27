class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count=0,prevPointer=0,prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=prev){
                prev=nums[i];
                swap(nums,i,++prevPointer);
               
            }
            else{
                count++;
            }
            
        }

        return nums.length-count;
    }

    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}