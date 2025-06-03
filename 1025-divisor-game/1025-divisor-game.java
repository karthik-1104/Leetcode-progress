class Solution {
    public boolean divisorGame(int n) {
       boolean choose=false;
       int x=1;

       while(x<n){
        choose=!choose;
        n-=x;
       }

       return choose;
    }
}