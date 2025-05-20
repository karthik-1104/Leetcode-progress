class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        StringBuilder s1= new StringBuilder(s);
        s1.reverse();
        if(s.equals(s1.toString()))
            return true;
            return false;
        
    }
}