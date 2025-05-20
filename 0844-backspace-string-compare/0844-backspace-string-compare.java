class Solution {
    public boolean backspaceCompare(String s, String t) {
        if (removeBackspaces(s).equals(removeBackspaces(t)))
          return true;
        else
          return false;
    }
     public static String removeBackspaces(String s){
        int n=s.length();
        int idx=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)!='#'){
                s=s.substring(0,idx)+s.charAt(i)+s.substring(idx+1);
                idx++;
            }
            else if(s.charAt(i)=='#' && idx>=0){
                idx--;
            }

            if(idx<0){
                idx=0;
            }
        }

        return s.substring(0,idx);
    }
}