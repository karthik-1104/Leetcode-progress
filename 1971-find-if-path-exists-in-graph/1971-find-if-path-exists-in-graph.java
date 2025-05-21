class Solution {

    public  boolean dfs(int src,int dest,ArrayList<ArrayList<Integer>> graph,boolean visited[]){

        visited[src]=true;
        if(src==dest) return true;
        for(int neighbour : graph.get(src)){
            if(!visited[neighbour]){
                if(dfs(neighbour,dest,graph,visited)){
                    return true;
                }
            }
        }

        return false;
    }
   
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        ArrayList<ArrayList<Integer>> adjList =new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<Integer>());
        }

        for(int[] edge: edges){
            int ui=edge[0],vi=edge[1];
            adjList.get(ui).add(vi);
            adjList.get(vi).add(ui);        
    }

    boolean visited[]=new boolean[n];
    return dfs(source,destination,adjList,visited);
}
}