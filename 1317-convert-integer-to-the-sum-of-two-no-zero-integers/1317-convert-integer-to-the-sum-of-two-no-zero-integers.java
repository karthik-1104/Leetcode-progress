class Solution {
    public int[] getNoZeroIntegers(int n) {
            for(int i=1;i<n;i++){
                if(isNumberValid(n-i) && isNumberValid(i)){
                    return new int[] {n-i,i};
                }
            }

            return new int[] {};
    }

    public boolean isNumberValid(int a){
        while(a>0){
            int bit=a%10;

            if(bit==0)
            return false;

            a/=10;
        }

        return true;
    }


}