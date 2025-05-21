class Solution {
    public int search(int[] nums, int target) {

        int index=binarySearch(nums,target);

        return index;
    }

    public int binarySearch(int[] arr,int target){

         int left=0,right=arr.length-1;

         while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid]==target){
                return mid;
            }

            else if(arr[left]<=arr[mid]){
                if(target<arr[mid] && target>=arr[left]){
                    right=mid-1;
                }

                else{
                    left=mid+1;
                }
            }

            else{

                if(target>arr[mid] && target<=arr[right]){
                    left=mid+1;
                }

                else{
                    right=mid-1;
                }
            }
         }

         return -1;
    }
}