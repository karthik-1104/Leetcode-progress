class Solution {
    public int minSteps(int n) {
        int current=1;
        int ans=0;
        int currentcopied=0;
        while(current<n){
            if(n%current==0){
                currentcopied=current;
                ans++;
            }
            current+=currentcopied;
            ans++;
        }
        return ans;
    }
}