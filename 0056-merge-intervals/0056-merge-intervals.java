class Solution {
    public int[][] merge(int[][] arr) {
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(arr,new Comparator<int[]>() {
            public int compare(int[] a,int[] b) {
                return a[0]-b[0];
            }
        });

        for(int i=0;i<arr.length;i++){
            int first=arr[i][0];
            int last=arr[i][1];
            
            if(list.isEmpty() || arr[i][0]>list.getLast().get(1)){
                list.add(Arrays.asList(first,last));
            }

            else{
                list.getLast().set(1,Integer.max(list.getLast().get(1),last));
            }
        }

        int[][] intervals=new int[list.size()][2];

        for(int i=0;i<list.size();i++){
            for(int j=0;j<2;j++){
                intervals[i][j]=list.get(i).get(j);
            }
        }
        
        return intervals;
    }
}