class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
         Deque<Integer> dq= new LinkedList<>();
        int n=arr.length;
        int res[]=new int[n-k+1];
        for(int i=0;i<n;i++){

            if(!dq.isEmpty() && dq.peekFirst()<i-k+1){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && arr[i]>arr[dq.peekLast()]){   
                    dq.pollLast();
                }
                dq.addLast(i);
               if(i>=k-1){
                res[i-k+1]=arr[dq.peekFirst()];
               }
                
            }
            return res;
    }
}