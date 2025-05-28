class Solution {
    public int[] rearrangeArray(int[] nums) {
        int negativeIndex=1,positiveIndex=0;
        int rearrangedArray[]=new int[nums.length];
        for(int num: nums){
            if(num>0){
                rearrangedArray[positiveIndex]=num;
                positiveIndex+=2;
            }
            else{
                rearrangedArray[negativeIndex]=num;
                negativeIndex+=2;
            }
        }

        return rearrangedArray;
    }
}