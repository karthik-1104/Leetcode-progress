class Solution {
    public int reverse(int n) {
        long revNum = 0;
        if(n<0){
         n=(-1)*n;   
          while (n > 0) {
            revNum = revNum * 10 + n % 10;
            n = n / 10;
         }
        revNum=(-1)*revNum;
        }
        else{
            while (n > 0) {
            revNum = revNum * 10 + n % 10;
            n = n / 10;
        }
        }
        
return (revNum<Integer.MIN_VALUE || revNum>Integer.MAX_VALUE)? 0:(int)revNum;
    }
}