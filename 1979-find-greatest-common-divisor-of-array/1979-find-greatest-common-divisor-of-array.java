class Solution {
    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);
        return gcd(nums[0],nums[nums.length-1]);

    }

    public static int gcd(int a,int b){
        int temp=1;

        while(temp!=0){
            temp=a%b;
            a=b;
            b=temp;
        }
        return a; 
    }
}