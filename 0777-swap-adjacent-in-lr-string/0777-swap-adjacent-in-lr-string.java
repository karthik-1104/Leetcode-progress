class Solution {
    public boolean canTransform(String start, String result) {
        int f = 0;
        int s = 0;
        while(f<start.length() || s<result.length()) {
            while(f<start.length() && start.charAt(f)=='X') 
            f++;
            while(s<result.length() && result.charAt(s)=='X') 
            s++;
            if (f==start.length() || s==result.length()) 
            return s==result.length() && f==start.length();
            char stChar=start.charAt(f);
            char enChar=result.charAt(s);
            if (stChar!=enChar) 
            return false;
            if (stChar=='R' && f>s) 
            return false;
            if (stChar=='L' && f<s) 
            return false;
            f++;
            s++;
        }
        return true;
    }
}