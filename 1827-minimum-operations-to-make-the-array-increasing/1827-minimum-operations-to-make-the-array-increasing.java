class Solution {
    public int minOperations(int[] arr) {
        int count=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]){
                int diff=Math.abs(arr[i]-arr[i-1])+1;
                count+=diff;
                arr[i]=arr[i]+diff;
            }
        }

        return count;
    }
}