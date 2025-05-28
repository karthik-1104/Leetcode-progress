class Solution {
    public int numDecodings(String s) {
         int length = s.length();
       
        int prevCount = 0, currentCount = 1;
        for (int i = 1; i <= length; ++i) {
            
            int nextCount = 0;    
            if (s.charAt(i - 1) != '0') {
                nextCount = currentCount;
            }
            if (i > 1 && s.charAt(i - 2) != '0' && Integer.valueOf(s.substring(i - 2, i)) <= 26) {
                  nextCount += prevCount;
            } 
            prevCount = currentCount;
            currentCount = nextCount;
        }
      
      
        return currentCount;
    }
}