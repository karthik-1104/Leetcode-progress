class Solution {
    public int maxProfit(int[] arr) {
        int low=0,high=1;
        int maxP=0;
        while(high<arr.length){

            if(arr[low]<arr[high]){
                maxP=Math.max(maxP,arr[high]-arr[low]);
            }
            else
            {
                low=high;
            }

            high++;
        }
        return maxP;
    }
}