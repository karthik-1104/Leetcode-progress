class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int sum=0,stations=0;
        int start=n-1,end=n-1;

        while(stations<n){

            sum+=gas[end]-cost[end];
            stations++;
            end=(end+1)%n;

            while(sum<0 && stations<n){
                start--;
                sum+=gas[start]-cost[start];
                stations++;
            }
        }

        return sum>=0? start : -1;
    }
}