class Solution {
    public int mySqrt(int target) {
         if (target<2) return target;

        int start=1,end=target/2;
        while (start<=end) {
            int mid=start+(end-start)/2;
            long square=(long)mid*mid;

            if (square==target) return mid;
            else if (square<target) start=mid+1;
            else end=mid-1;
        }
        return end;
    }
}