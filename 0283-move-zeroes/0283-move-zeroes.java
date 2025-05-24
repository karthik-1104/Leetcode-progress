class Solution {
    public void moveZeroes(int[] arr) {
        
          int zeroIndex=0;
     
        for(int num: arr){
            if(num!=0){
                arr[zeroIndex++]=num;
            }
        }
        
        while(zeroIndex<arr.length){
            arr[zeroIndex++]=0;
        }
    }
}