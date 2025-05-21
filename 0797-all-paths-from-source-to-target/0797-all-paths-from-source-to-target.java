class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
         int n = graph.length; 
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.offer(Arrays.asList(0)); 
        List<List<Integer>> allPaths = new ArrayList<>(); 
      
       
        while (!queue.isEmpty()) {
            List<Integer> path = queue.poll(); 
            int lastNode = path.get(path.size() - 1); 
          
           
            if (lastNode == n - 1) {
                allPaths.add(path);
            } else {
               
                for (int neighbor : graph[lastNode]) {
                    List<Integer> newPath = new ArrayList<>(path); 
                    newPath.add(neighbor);
                    queue.offer(newPath); 
                }
            }
        }
      
        return allPaths; 
    }
}