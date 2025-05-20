class Solution {
    public int[] dailyTemperatures(int[] temp) {
         int n=temp.length;
        int res[]=new int[n];
         Stack<Integer> stack = new Stack<>();
        int prev;
         for(int i=0;i<n;i++){
            while((!stack.isEmpty()) && temp[i]>temp[stack.peek()]){
                prev=stack.pop();
                res[prev]=i-prev;
            }
            stack.push(i);
         }

       return res;
    }
}