class Solution {
    public int minTimeToType(String word) {
       char pointer='a';
       int count=0;
       for(char c: word.toCharArray()){
        int diff=Math.abs(c-pointer);
        int steps= Math.min(diff,26-diff);
        count+=steps+1;
        pointer=c;

       }

       return count;
    }
}