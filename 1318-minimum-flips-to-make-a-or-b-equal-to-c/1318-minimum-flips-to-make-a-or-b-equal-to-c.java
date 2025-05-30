class Solution {
    public int minFlips(int a, int b, int c) {
        int flip=0;
        for(int i=0;i<=32;i++){

            int num1=(a>>i)&1;
            int num2=(b>>i)&1;
            int num3=(c>>i)&1;
            
            if(num3==0){
                flip+=(num1+num2);
            }
            else{
                if(num1==0 && num2==0){
                    flip+=1;
                }
                
            }
               
        }

         return flip;
        
    }
}