class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String s1=str2+str1;
        String s2=str1+str2;
        if(!s1.equals(s2)) return "";
        int gcd=gcd(str1.length(),str2.length());
        return str1.substring(0,gcd);
    }

    public static int gcd(int num1,int num2){
        int a=1;
        while(a!=0){
            a=num1%num2;
            num1=num2;
            num2=a;
        }
        return num1;
    }
}